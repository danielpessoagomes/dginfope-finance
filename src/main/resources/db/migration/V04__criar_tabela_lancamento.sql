CREATE TABLE lancamento (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	data DATE NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	codigo_responsavel BIGINT(20) NOT NULL,
	codigo_categoria BIGINT(20) NOT NULL,
	codigo_banco BIGINT(20) NOT NULL,
	valor DECIMAL(10,2) NOT NULL,
	FOREIGN KEY (codigo_responsavel) REFERENCES responsavel(codigo),
	FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
	FOREIGN KEY (codigo_banco) REFERENCES banco(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;