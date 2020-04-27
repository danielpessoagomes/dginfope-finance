CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_classificacao BIGINT(20),
	codigo_sub_classificacao BIGINT(20),
	descricao VARCHAR(100) NOT NULL,
	FOREIGN KEY (codigo_classificacao) REFERENCES categoria(codigo),
	FOREIGN KEY (codigo_sub_classificacao) REFERENCES categoria(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (null, null, 'Receita');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (null, null, 'Despesa');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1, null, 'Honorário');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2, null, 'Despesas com Pessoal');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2, null, 'Despesas com Concessionárioa');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2, null, 'Despesas Administrativas');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2, null, 'Despesas Bancárias');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2, null, 'Despesas com Impostos e Multas Fiscais');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Empréstimo');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Honorário extra');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Honorário mensal');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Honorário vencido');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Imposto de Renda');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Maria de Lourdes');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Negociação');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Reembolso');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (1,3,'Taxa de Balanço Anual');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'13º Salário');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Assistência médica/social');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'FGTS');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Gratificações');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'INSS');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Férias');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Rescisão (Idenizações)');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Pró labore');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Salários e ordenados');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,4,'Vale transporte');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,5,'Água / Esgoto');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,5,'Energia elétrica');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,5,'Internet');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,5,'Telefonia Fixa');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,5,'Telefonia Móvel');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Alimentação');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Aluguel Imobilizado');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Aluguéis e arrendamento');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Associação de classe');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Cartão de crédito');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Condomínio');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Contribuição/donativos');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Compra à debito');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Curso');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Correios');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Despesas com manutenção da loja');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Impressos');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Legais e judiciais');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Diversas');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Multas de trânsito');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Materiais de consumo');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Propaganda e publicidade');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Seguros');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Serviços terceiros pessoa jurídica');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Segurança privada');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Revistas e jornais');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Viagens e representações');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Serviços terceiros pessoa física');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Despesas com manutenção');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Passagem');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Saque');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Combustivel');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Cartório');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Software e Consultoria');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,6,'Registro domínio');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Conta Garantida');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Pacote de Serviços');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Despesas financeiras');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Empréstimo');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Título de capitalização');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Financiamento');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Encargos e Juros de Mora');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Reembolso');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Consórcio');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'IOF');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Tarifa');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,7,'Juros');

INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,8,'Impostos e taxas');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,8,'Multas fiscais');
INSERT INTO categoria (codigo_classificacao, codigo_sub_classificacao, descricao) value (2,8,'Outras taxas e encargos');


