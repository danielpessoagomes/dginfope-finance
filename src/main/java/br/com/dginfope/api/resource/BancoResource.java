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

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.repository.BancoRepository;
import br.com.dginfope.api.repository.filter.BancoFilter;
import br.com.dginfope.api.service.BancoService;

@RestController
@RequestMapping("/bancos")
public class BancoResource {
	
	@Autowired
	private BancoRepository bancoRepository;
	
	@Autowired
	private BancoService bancoService;

	@GetMapping
	public Page<Banco> listar(BancoFilter bancoFilter, Pageable pageable) {
		return bancoRepository.filtrar(bancoFilter, pageable);
	}
	
	@PostMapping
	public ResponseEntity<Banco> criar(@Valid @RequestBody Banco banco, HttpServletResponse response){
		Banco bancoSalvo = bancoService.salvar(banco);
		return ResponseEntity.status(HttpStatus.CREATED).body(bancoSalvo);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Banco> buscarPeloCodigo(@PathVariable Long codigo){
		Optional<Banco> banco = bancoRepository.findById(codigo);
		return banco.isPresent() ? ResponseEntity.ok(banco.get()) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo){
		bancoService.excluir(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Banco> atualizar(@PathVariable Long codigo, @Valid @RequestBody Banco banco) {
		Banco bancoSalvo = bancoService.atualizar(codigo, banco);
		return ResponseEntity.ok(bancoSalvo);
	}

}
