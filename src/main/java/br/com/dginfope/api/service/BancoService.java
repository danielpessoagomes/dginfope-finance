package br.com.dginfope.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;

	public Banco salvar(Banco banco) {
		return bancoRepository.save(banco);
	}

	public Banco atualizar(Long codigo, Banco banco) {
		Banco bancoSalvo = buscarPorId(codigo);

		BeanUtils.copyProperties(banco, bancoSalvo, "codigo");

		return bancoRepository.save(bancoSalvo);
	}

	public void excluir(Long codigo) {
		Banco bancoSalvo = buscarPorId(codigo);
		bancoRepository.delete(bancoSalvo);
	}

	private Banco buscarPorId(Long codigo) {
		Optional<Banco> bancoSalvo = bancoRepository.findById(codigo);
		if (!bancoSalvo.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return bancoSalvo.get();
	}
}
