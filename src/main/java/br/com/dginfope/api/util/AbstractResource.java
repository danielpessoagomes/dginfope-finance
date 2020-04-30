package br.com.dginfope.api.util;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractResource<T> extends AbstractCrudService<T, Long> {

	@PostMapping
	public ResponseEntity<T> criar(@Valid @RequestBody T categoria, HttpServletResponse response){
		T t = salvar(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(t);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<T> buscarPeloCodigo(@PathVariable Long codigo){
		System.out.println(codigo);
		T t = buscarPorId(codigo);
		return ResponseEntity.ok(t);
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo){
		excluir(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<T> update(@PathVariable Long codigo, @Valid @RequestBody T t) {
		T tSave = atualizar(codigo, t);
		return ResponseEntity.ok(tSave);
	}
}
