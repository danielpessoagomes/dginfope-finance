package br.com.dginfope.api.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractCrudService<T, ID> {
	@Autowired
	JpaRepository<T, ID> repository;
		
	public List<T> listarTodos() {
		return repository.findAll();
	}
	
	public T salvar(T t) {
		return repository.save(t);
	}
	
	public T atualizar(ID id, T t) {
		T tSave = buscarPorId(id);
		
		BeanUtils.copyProperties(t, tSave, "id");
		
		return repository.save(tSave);
	}

	public void excluir(ID id) {
		T tSave = buscarPorId(id);
		repository.delete(tSave);
	}
	
	public T buscarPorId(ID id) {
		Optional<T> tSave = repository.findById(id);
		if(!tSave.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return tSave.get();
	}
}
