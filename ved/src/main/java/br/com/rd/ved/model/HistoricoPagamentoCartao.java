package br.com.rd.ved.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "historico_pagamento")
public class HistoricoPagamentoCartao {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historico")
	private Integer id;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pedido")
	private Pedido pedido;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER )
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cartao", nullable = true)
	private Cartao cartao;
	
	private Integer numeroParcela;
	
	private String statusPagamento;

	public HistoricoPagamentoCartao() {}

	public HistoricoPagamentoCartao(Pedido pedido, Cliente cliente, Cartao cartao, Integer numeroParcela,
			String statusPagamento) {
		this.pedido = pedido;
		this.cliente = cliente;
		this.cartao = cartao;
		this.numeroParcela = numeroParcela;
		this.statusPagamento = statusPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoPagamentoCartao other = (HistoricoPagamentoCartao) obj;
		return Objects.equals(id, other.id);
	}
	
}
