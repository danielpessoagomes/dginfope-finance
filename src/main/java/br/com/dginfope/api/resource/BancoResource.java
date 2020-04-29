package br.com.dginfope.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.repository.BancoRepository;
import br.com.dginfope.api.repository.filter.BancoFilter;
import br.com.dginfope.api.util.AbstractResource;

@RestController
@RequestMapping("/bancos")
public class BancoResource extends AbstractResource<Banco> {
	
	@Autowired
	private BancoRepository bancoRepository;

	@GetMapping
	public Page<Banco> listar(BancoFilter bancoFilter, Pageable pageable) {
		return bancoRepository.filtrar(bancoFilter, pageable);
	}
	

}
