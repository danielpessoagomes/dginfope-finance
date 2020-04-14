package br.com.dginfope.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dginfope.api.model.Responsavel;
import br.com.dginfope.api.repository.responsavel.ResponsavelRepositoryQuery;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long>, ResponsavelRepositoryQuery {

	Optional<Responsavel> findByNome(String nome);

}
