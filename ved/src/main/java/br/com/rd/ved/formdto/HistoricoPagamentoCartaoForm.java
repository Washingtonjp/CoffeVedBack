package br.com.rd.ved.formdto;

import java.util.List;
import java.util.Optional;
import br.com.rd.ved.dto.HistoricoPagamentoCartaoDTO;
import br.com.rd.ved.model.Cartao;
import br.com.rd.ved.model.Cliente;
import br.com.rd.ved.model.HistoricoPagamentoCartao;
import br.com.rd.ved.model.Pedido;
import br.com.rd.ved.repository.CartaoRepository;
import br.com.rd.ved.repository.ClienteRepository;
import br.com.rd.ved.repository.HistoricoPagamentoCartaoRepository;
import br.com.rd.ved.repository.PedidoRepository;

public class HistoricoPagamentoCartaoForm {

	private Integer pedido;
	private Integer cliente;
	private Integer cartao;
	private Integer numeroParcelas;
	private String statusPagamento;

	public HistoricoPagamentoCartaoForm(String pedido, String cliente, String cartao, String numeroParcelas,
			String statusPagamento) {
		this.pedido = Integer.parseInt(pedido);
		this.cliente = Integer.parseInt(cliente);
		this.cartao = Integer.parseInt(cartao);
		this.numeroParcelas = Integer.parseInt(numeroParcelas);
		this.statusPagamento = statusPagamento;
	}

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public Integer getCartao() {
		return cartao;
	}

	public void setCartao(Integer cartao) {
		this.cartao = cartao;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public HistoricoPagamentoCartao converter(PedidoRepository pedidoRepository, ClienteRepository clienteRepository,
							CartaoRepository cartaoRepository) {

		Optional<Pedido> pedido = pedidoRepository.findById(this.pedido);
		Optional<Cliente> cliente = clienteRepository.findById(this.cliente);
		Optional<Cartao> cartao = cartaoRepository.findById(this.cartao);
		HistoricoPagamentoCartao historico = new HistoricoPagamentoCartao(pedido.get(), cliente.get(),cartao.get(),numeroParcelas, statusPagamento);
		return historico;

	}
	
	public List<HistoricoPagamentoCartaoDTO> cadastrarHistorico(HistoricoPagamentoCartao historicoPagamento, Pedido pedido, HistoricoPagamentoCartaoRepository historicoPedidoRepository) {
		List<HistoricoPagamentoCartao> historico;		
		historico = pedido.getHistoricoPagamento();
		historico.add(historicoPagamento);
		pedido.setHistoricoPagamento(historico);
		historicoPedidoRepository.save(pedido);
		return HistoricoPagamentoCartaoDTO.converter(historico);
	} 
}
