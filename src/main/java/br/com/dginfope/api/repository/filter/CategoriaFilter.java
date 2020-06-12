package br.com.dginfope.api.repository.filter;

public class CategoriaFilter {

	private Long classificacao;
	private String descricao;

	public Long getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Long classificacao) {
		this.classificacao = classificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
