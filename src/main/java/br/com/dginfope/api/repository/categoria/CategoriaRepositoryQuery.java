package br.com.dginfope.api.repository.categoria;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.dginfope.api.model.Categoria;
import br.com.dginfope.api.repository.filter.CategoriaFilter;

public interface CategoriaRepositoryQuery {
	
	public Page<Categoria> filtrar(CategoriaFilter categoriaFilter, Pageable pageable);

}
