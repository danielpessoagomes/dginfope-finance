package br.com.dginfope.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.repository.banco.BancoRepositoryQuery;

public interface BancoRepository extends JpaRepository<Banco, Long>, BancoRepositoryQuery {

	Optional<Banco> findByNome(String nome);

}
