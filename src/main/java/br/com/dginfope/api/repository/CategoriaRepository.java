package br.com.dginfope.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dginfope.api.model.Categoria;
import br.com.dginfope.api.model.enumeration.TipoCategoria;
import br.com.dginfope.api.repository.categoria.CategoriaRepositoryQuery;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CategoriaRepositoryQuery {
	
	Optional<Categoria> findByDescricaoAndTipoCategoriaAndClassificacaoNotNull(String descricao, TipoCategoria tipoCategoria);

}
