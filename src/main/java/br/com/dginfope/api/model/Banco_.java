package br.com.dginfope.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Banco.class)
public abstract class Banco_ {

	public static volatile SingularAttribute<Banco, Long> codigo;
	public static volatile SingularAttribute<Banco, String> nome;
	public static volatile SingularAttribute<Banco, LocalDate> dataSaldo;
	public static volatile SingularAttribute<Banco, BigDecimal> saldo;

	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";
	public static final String DATA_SALDO = "dataSaldo";
	public static final String SALDO = "saldo";

}

