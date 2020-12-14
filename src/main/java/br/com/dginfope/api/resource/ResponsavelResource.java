package br.com.dginfope.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dginfope.api.model.Responsavel;
import br.com.dginfope.api.repository.ResponsavelRepository;
import br.com.dginfope.api.repository.filter.ResponsavelFilter;
import br.com.dginfope.api.util.AbstractResource;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelResource extends AbstractResource<Responsavel> {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;

	@GetMapping
	public Page<Responsavel> listar(ResponsavelFilter responsavelFilter, Pageable pageable) {
		return responsavelRepository.filtrar(responsavelFilter, pageable);
	}
	

}
