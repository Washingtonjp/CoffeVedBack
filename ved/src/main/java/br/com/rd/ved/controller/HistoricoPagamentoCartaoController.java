package br.com.rd.ved.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.rd.ved.dto.HistoricoPagamentoCartaoDTO;
import br.com.rd.ved.formdto.HistoricoPagamentoCartaoForm;
import br.com.rd.ved.model.HistoricoPagamentoCartao;
import br.com.rd.ved.model.Pedido;
import br.com.rd.ved.repository.CartaoRepository;
import br.com.rd.ved.repository.ClienteRepository;
import br.com.rd.ved.repository.HistoricoPagamentoCartaoRepository;
import br.com.rd.ved.repository.PedidoRepository;

@RestController
@RequestMapping("/historico")
public class HistoricoPagamentoCartaoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
		
	@Autowired
	private CartaoRepository cartaoRepository;
	
	@Autowired
	private HistoricoPagamentoCartaoRepository historicoPagamentoRepository;

	
	@GetMapping("/{id}/detalhes")
	public HistoricoPagamentoCartaoDTO listar(@PathVariable("id") Integer id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		List <HistoricoPagamentoCartao> historicos = pedido.get().getHistoricoPagamento(); 
		return new HistoricoPagamentoCartaoDTO(historicos.get(0));
	}
		
		
	@PostMapping("/novo")
	@Transactional
	public ResponseEntity<HistoricoPagamentoCartaoDTO> cadastrar(@RequestBody @Valid HistoricoPagamentoCartaoForm historicoForm, UriComponentsBuilder uriBuilder) {
		
		Optional<Pedido> pedido = pedidoRepository.findById(historicoForm.getPedido());
		
		HistoricoPagamentoCartao historico = historicoForm.converter(pedidoRepository, 
															   clienteRepository, 
															   cartaoRepository);
		historicoPagamentoRepository.save(historico);
		historicoForm.cadastrarHistorico(historico, pedido.get(), historicoPagamentoRepository);
		URI uri = uriBuilder.path("/pedido/{id}").buildAndExpand(historico.getId()).toUri();
		return ResponseEntity.created(uri).body(new HistoricoPagamentoCartaoDTO(historico));

	}	
		
		
		
		
		
}

	
	
	
	
	