package br.com.dginfope.api.repository.responsavel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import br.com.dginfope.api.model.Responsavel;
import br.com.dginfope.api.repository.filter.ResponsavelFilter;

public class ResponsavelRepositoryImpl implements ResponsavelRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Responsavel> filtrar(ResponsavelFilter responsavelFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Responsavel> criteria = builder.createQuery(Responsavel.class);
		Root<Responsavel> root = criteria.from(Responsavel.class);

		Predicate[] predicates = criarRestricoes(responsavelFilter, builder, root);
		criteria.where(predicates);

		TypedQuery<Responsavel> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		return new PageImpl<Responsavel>(query.getResultList(), pageable, total(responsavelFilter));
	}
	
	private Predicate[] criarRestricoes(ResponsavelFilter responsavelFilter, CriteriaBuilder builder, Root<Responsavel> root) {
		
		List<Predicate> predicates = new ArrayList<Predicate>();
				
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	private void adicionarRestricoesDePaginacao(TypedQuery<Responsavel> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistroPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistroPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistroPorPagina);
	}

	private Long total(ResponsavelFilter responsavelFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Responsavel> root = criteria.from(Responsavel.class);

		Predicate[] predicates = criarRestricoes(responsavelFilter, builder, root);

		criteria.where(predicates);

		criteria.select(builder.count(root));

		return manager.createQuery(criteria).getSingleResult();
	}

}
