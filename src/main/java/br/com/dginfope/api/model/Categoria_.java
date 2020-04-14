package br.com.dginfope.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categoria.class)
public abstract class Categoria_ {

	public static volatile SingularAttribute<Categoria, Long> codigo;
	public static volatile SingularAttribute<Categoria, Categoria> subCategoria;
	public static volatile SingularAttribute<Categoria, Categoria> categoria;
	public static volatile SingularAttribute<Categoria, String> descricao;

	public static final String CODIGO = "codigo";
	public static final String SUB_CATEGORIA = "subCategoria";
	public static final String CATEGORIA = "categoria";
	public static final String DESCRICAO = "descricao";

}

