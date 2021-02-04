CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_classificacao BIGINT(20),
	tipo_categoria VARCHAR(15) NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	FOREIGN KEY (codigo_classificacao) REFERENCES categoria(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Empréstimo'); 
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Honorário Extra'); 
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Honorário mensal');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Honorário Vencido');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Imposto de Renda');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Maria de Lourdes Silva');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Negociação');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Reembolso');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Cartão de Crédito/Débito');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'RECEITAS', 'Taxa de Balanço Anual');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'DESPESAS', 'Despesas com Pessoal');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'DESPESAS', 'Despesas com Concessionárioa');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'DESPESAS', 'Despesas Administrativas');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'DESPESAS', 'Despesas Bancárias');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (null, 'DESPESAS', 'Despesas com Impostos e Multas Fiscais');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','13º Salário');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Assistência médica/social');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','FGTS');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Gratificações');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','INSS');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Férias');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Rescisão (Idenizações)');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Pró labore');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Salários e ordenados');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (11,'DESPESAS','Vale transporte');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (12,'DESPESAS','Água / Esgoto');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (12,'DESPESAS','Energia elétrica');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (12,'DESPESAS','Internet');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (12,'DESPESAS','Telefonia Fixa');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (12,'DESPESAS','Telefonia Móvel');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Alimentação');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Aluguel Imobilizado');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Aluguéis e arrendamento');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Associação de classe');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Cartão de crédito');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Condomínio');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Contribuição/donativos');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Compra à debito');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Curso');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Correios');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Despesas com manutenção da loja');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Impressos');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Legais e judiciais');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Diversas');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Multas de trânsito');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Materiais de consumo');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Propaganda e publicidade');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Seguros');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Serviços terceiros pessoa jurídica');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Segurança privada');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Revistas e jornais');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Viagens e representações');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Serviços terceiros pessoa física');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Despesas com manutenção');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Passagem');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Saque');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Combustivel');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Cartório');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Software e Consultoria');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Registro domínio');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','TV Por assinatura');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (13,'DESPESAS','Hospedagem domínio');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Conta Garantida');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Pacote de Serviços');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Despesas financeiras');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Empréstimo');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Título de capitalização');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Financiamento');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Encargos e Juros de Mora');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Reembolso');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Consórcio');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','IOF');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Tarifa');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (14,'DESPESAS','Juros');

INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (15,'DESPESAS','Impostos e taxas');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (15,'DESPESAS','Multas fiscais');
INSERT INTO categoria (codigo_classificacao, tipo_categoria, descricao) value (15,'DESPESAS','Outras taxas e encargos');


