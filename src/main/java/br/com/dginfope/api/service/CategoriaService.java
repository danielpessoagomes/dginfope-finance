package br.com.dginfope.api.service;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.dginfope.api.model.Categoria;
import br.com.dginfope.api.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria salvar(Categoria categoria) {	
		if(StringUtils.isEmpty(categoria.getTipoCategoria().toString())) {
			Categoria c = buscarClassificacao(categoria.getClassificacao().getCodigo());
			categoria.setClassificacao(c);
		}
		
		return categoriaRepository.save(categoria);
	}
	
	public Categoria atualizar(Long codigo, Categoria categoria) {
		Categoria categoriaSalvo = buscarPorId(codigo);
		
		BeanUtils.copyProperties(categoria, categoriaSalvo, "codigo");
		
		return categoriaRepository.save(categoriaSalvo);
	}

	public void excluir(Long codigo) {
		Categoria categoriaSalvo = buscarPorId(codigo);
		categoriaRepository.delete(categoriaSalvo);
	}
	
	public Categoria buscarClassificacao(Long codigo) {
		return buscarPorId(codigo);
	}
	
	private Categoria buscarPorId(Long codigo) {
		Optional<Categoria> categoriaSalvo = categoriaRepository.findById(codigo);
		if(!categoriaSalvo.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return categoriaSalvo.get();
	}
}
