package br.com.dginfope.api.resource;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dginfope.api.model.Categoria;
import br.com.dginfope.api.repository.CategoriaRepository;
import br.com.dginfope.api.repository.filter.CategoriaFilter;
import br.com.dginfope.api.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping
	public Page<Categoria> listar(CategoriaFilter categoriaFilter, Pageable pageable) {
		return categoriaRepository.filtrar(categoriaFilter, pageable);
	}
	
	
	@PostMapping
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response){
		Categoria categoriaSalvo = categoriaService.salvar(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalvo);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable Long codigo){
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		return categoria.isPresent() ? ResponseEntity.ok(categoria.get()) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo){
		categoriaService.excluir(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Categoria> atualizar(@PathVariable Long codigo, @Valid @RequestBody Categoria categoria) {
		Categoria categoriaSalvo = categoriaService.atualizar(codigo, categoria);
		return ResponseEntity.ok(categoriaSalvo);
	}

}
