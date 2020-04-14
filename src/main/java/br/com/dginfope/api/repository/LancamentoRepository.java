package br.com.dginfope.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dginfope.api.model.Lancamento;
import br.com.dginfope.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
