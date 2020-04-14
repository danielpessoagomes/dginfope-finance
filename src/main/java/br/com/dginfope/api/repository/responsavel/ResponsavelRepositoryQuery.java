package br.com.dginfope.api.repository.responsavel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.dginfope.api.model.Responsavel;
import br.com.dginfope.api.repository.filter.ResponsavelFilter;

public interface ResponsavelRepositoryQuery {
	
	public Page<Responsavel> filtrar(ResponsavelFilter responsavelFilter, Pageable pageable);

}
