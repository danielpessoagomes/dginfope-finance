CREATE TABLE banco (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	saldo DECIMAL(10,2) NOT NULL,
	data_saldo DATE NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO banco (nome, saldo, data_saldo) value ('Banco do Brasil PF', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Banco do Nordeste', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Bradesco', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Caixa Econômica Federal', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Itaú', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Santander', 0.00, '2020-04-01');
INSERT INTO banco (nome, saldo, data_saldo) value ('Caixa Geral', 0.00, '2020-04-01');