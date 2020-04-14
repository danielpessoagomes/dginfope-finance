package br.com.dginfope.api.repository.banco;

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

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.model.Banco_;
import br.com.dginfope.api.repository.filter.BancoFilter;

public class BancoRepositoryImpl implements BancoRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Banco> filtrar(BancoFilter bancoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Banco> criteria = builder.createQuery(Banco.class);
		Root<Banco> root = criteria.from(Banco.class);

		Predicate[] predicates = criarRestricoes(bancoFilter, builder, root);
		criteria.where(predicates);

		TypedQuery<Banco> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		return new PageImpl<Banco>(query.getResultList(), pageable, total(bancoFilter));
	}
	
	private Predicate[] criarRestricoes(BancoFilter bancoFilter, CriteriaBuilder builder, Root<Banco> root) {
		
		List<Predicate> predicates = new ArrayList<Predicate>();
		
		if (bancoFilter.getNome() != null) {
			predicates.add(builder.equal(root.get(Banco_.nome), bancoFilter.getNome()));
		}
	
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	private void adicionarRestricoesDePaginacao(TypedQuery<Banco> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistroPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistroPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistroPorPagina);
	}

	private Long total(BancoFilter bancoFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Banco> root = criteria.from(Banco.class);

		Predicate[] predicates = criarRestricoes(bancoFilter, builder, root);

		criteria.where(predicates);

		criteria.select(builder.count(root));

		return manager.createQuery(criteria).getSingleResult();
	}

}
