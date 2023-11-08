
create table contas (
	id serial primary key,
	apelido varchar(40),
	numero varchar(10),
	agencia varchar(10),
	instituicao varchar(300),
	saldo float	
);


create table investimentos (
	id serial primary key,
	renda_fixa bool,
	conta int,
	data date,
	valor float,
	descricao varchar(100),
	foreign key (conta) references contas(id)
);

create table acoes (
	id serial primary key,
	tag varchar(6),
	cotacao float
);

create table acoes_contas (
	id serial primary key,
	id_conta int,
	id_acao int,
	foreign key (id_conta) references Contas(id),
	foreign key (id_acao) references acoes(id)
);

select * from acoes_contas