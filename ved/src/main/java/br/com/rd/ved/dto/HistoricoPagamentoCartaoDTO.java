package br.com.rd.ved.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.ved.model.Cartao;
import br.com.rd.ved.model.Cliente;
import br.com.rd.ved.model.HistoricoPagamentoCartao;

public class HistoricoPagamentoCartaoDTO {
	
	private Cartao cartao;
	private Integer numeroParcelas;
	private String statusPagamento;
	
	public HistoricoPagamentoCartaoDTO(HistoricoPagamentoCartao historico) {
		this.cartao = historico.getCartao();
		this.numeroParcelas = historico.getNumeroParcela();
		this.statusPagamento = historico.getStatusPagamento();
	}


	public String getCartao() {
		return cartao.getNomeTitular();
	} 
	
	
	public String getBandeira() {
		return cartao.getIdBandeira().getNome();
	} 
	
	
	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}


	public String getStatusPagamento() {
		return statusPagamento;
	}


	
	
	public static List<HistoricoPagamentoCartaoDTO> converter(List<HistoricoPagamentoCartao> historicos) {
		return historicos.stream().map(HistoricoPagamentoCartaoDTO::new).collect(Collectors.toList());
	}
}
