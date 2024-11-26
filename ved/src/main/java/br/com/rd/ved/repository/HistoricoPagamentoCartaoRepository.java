package br.com.rd.ved.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.rd.ved.model.HistoricoPagamentoCartao;
import br.com.rd.ved.model.Pedido;

public interface HistoricoPagamentoCartaoRepository extends JpaRepository<HistoricoPagamentoCartao, Integer>, CrudRepository<HistoricoPagamentoCartao,Integer>{

	void save(Pedido pedido);


}
