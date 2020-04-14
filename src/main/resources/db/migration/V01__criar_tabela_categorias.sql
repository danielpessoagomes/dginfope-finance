CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_categoria BIGINT(20),
	codigo_sub_categoria BIGINT(20),
	descricao VARCHAR(100) NOT NULL,
	FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
	FOREIGN KEY (codigo_sub_categoria) REFERENCES categoria(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null, null, 'Receita');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null, null, 'Despesa');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (1, null, 'Honorário');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (2, null, 'Despesas com Pessoal');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (2, null, 'Despesas com Concessionárioa');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (2, null, 'Despesas Administrativas');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (2, null, 'Despesas Bancárias');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (2, null, 'Despesas com Impostos e Multas Fiscais');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Empréstimo');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Honorário extra');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Honorário mensal');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Honorário vencido');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Imposto de Renda');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Maria de Lourdes');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Negociação');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Reembolso');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,3,'Taxa de Balanço Anual');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'14º Salário');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Assistência médica/social');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'FGTS');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Gratificações');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'INSS');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Férias');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Rescisão (Idenizações)');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Pró labore');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Salários e ordenados');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,4,'Vale transporte');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,5,'Água / Esgoto');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,5,'Energia elétrica');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,5,'Internet');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,5,'Telefonia Fixa');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,5,'Telefonia Móvel');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Alimentação');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Aluguel Imobilizado');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Aluguéis e arrendamento');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Associação de classe');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Cartão de crédito');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Condomínio');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Contribuição/donativos');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Compra à debito');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Curso');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Correios');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Despesas com manutenção da loja');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Impressos');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Legais e judiciais');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Diversas');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Multas de trânsito');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Materiais de consumo');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Propaganda e publicidade');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Seguros');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Serviços terceiros pessoa jurídica');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Segurança privada');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Revistas e jornais');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Viagens e representações');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Serviços terceiros pessoa física');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Despesas com manutenção');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Passagem');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Saque');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Combustivel');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Cartório');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,6,'Software e Consultoria');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Conta Garantida');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Pacote de Serviços');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Despesas financeiras');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Empréstimo');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Título de capitalização');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Financiamento');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Encargos e Juros de Mora');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Reembolso');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Consórcio');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'IOF');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Tarifa');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,7,'Juros');

INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,8,'Impostos e taxas');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,8,'Multas fiscais');
INSERT INTO categoria (codigo_categoria, codigo_sub_categoria, descricao) value (null,8,'Outras taxas e encargos');

