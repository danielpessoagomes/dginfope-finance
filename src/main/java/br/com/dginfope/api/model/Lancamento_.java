package br.com.dginfope.api.model;

import br.com.dginfope.api.model.enumeration.TipoLancamento;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lancamento.class)
public abstract class Lancamento_ {

	public static volatile SingularAttribute<Lancamento, Long> codigo;
	public static volatile SingularAttribute<Lancamento, TipoLancamento> tipoLancamento;
	public static volatile SingularAttribute<Lancamento, LocalDate> data;
	public static volatile SingularAttribute<Lancamento, Categoria> categoria;
	public static volatile SingularAttribute<Lancamento, BigDecimal> valor;
	public static volatile SingularAttribute<Lancamento, Banco> banco;
	public static volatile SingularAttribute<Lancamento, Responsavel> responsavel;
	public static volatile SingularAttribute<Lancamento, String> descricao;

	public static final String CODIGO = "codigo";
	public static final String TIPO_LANCAMENTO = "tipoLancamento";
	public static final String DATA = "data";
	public static final String CATEGORIA = "categoria";
	public static final String VALOR = "valor";
	public static final String BANCO = "banco";
	public static final String RESPONSAVEL = "responsavel";
	public static final String DESCRICAO = "descricao";

}

