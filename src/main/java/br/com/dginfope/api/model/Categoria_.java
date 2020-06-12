package br.com.dginfope.api.model;

import br.com.dginfope.api.model.enumeration.TipoCategoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categoria.class)
public abstract class Categoria_ {

	public static volatile SingularAttribute<Categoria, Long> codigo;
	public static volatile SingularAttribute<Categoria, TipoCategoria> tipoCategoria;
	public static volatile SingularAttribute<Categoria, Categoria> classificacao;
	public static volatile SingularAttribute<Categoria, String> descricao;

	public static final String CODIGO = "codigo";
	public static final String TIPO_CATEGORIA = "tipoCategoria";
	public static final String CLASSIFICACAO = "classificacao";
	public static final String DESCRICAO = "descricao";

}

