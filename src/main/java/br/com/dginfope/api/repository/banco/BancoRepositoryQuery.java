package br.com.dginfope.api.repository.banco;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.repository.filter.BancoFilter;

public interface BancoRepositoryQuery {
	
	public Page<Banco> filtrar(BancoFilter bancoFilter, Pageable pageable);

}
