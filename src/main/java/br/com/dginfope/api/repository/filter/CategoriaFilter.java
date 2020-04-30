package br.com.dginfope.api.repository.filter;

public class CategoriaFilter {
	
	private Long categoria;
	private Long subcategoria;
	private String descricao;

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

	public Long getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Long subcategoria) {
		this.subcategoria = subcategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
