package br.com.dginfope.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "codigo_classificacao", referencedColumnName = "codigo", updatable = false)
	private Categoria classificacao;

	@JsonIgnoreProperties("classificacao")
	@ManyToOne
	@JoinColumn(name = "codigo_sub_classificacao", referencedColumnName = "codigo", updatable = false)
	private Categoria subClassificacao;

	private String descricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Categoria getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Categoria classificacao) {
		this.classificacao = classificacao;
	}

	public Categoria getSubClassificacao() {
		return subClassificacao;
	}

	public void setSubClassificacao(Categoria subClassificacao) {
		this.subClassificacao = subClassificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
