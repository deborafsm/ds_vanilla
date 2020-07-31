CREATE database ds_vanilla;
use ds_vanilla;

create table usuarios(
id int primary key,
login varchar(20)  unique,
senha varchar(20)
);

CREATE TABLE pessoas(
	id_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome varchar(200),
    sexo varchar(15),
    telefone varchar(200),
    celular varchar(200),
    email varchar(200),
    data_nasc varchar(50),
    rg varchar(200),
    cpf varchar(200),
    estado_civil varchar(200),
    tipo_contrato varchar(200),
    cep varchar(200),
    cidade varchar(200),
    estado varchar(200),
    grau_esc varchar(200)
    
);

alter table pessoas add column endereco varchar(200);
CREATE TABLE empresa(
id INT PRIMARY KEY AUTO_INCREMENT,
razao_social VARCHAR(100) unique,
nome_fantasia varchar(100) ,
cnpj VARCHAR(50) unique,
rua VARCHAR(50),
referencia VARCHAR(100),
primeiro_tel varchar(50),
segundo_tel varchar(50),
email varchar(70)

);
drop table empresa;

create table vagas(
cod_vaga int primary key auto_increment,
data_vaga varchar(200),
nome_empregador varchar(200),
titulo varchar(200),
descricao varchar(200),
celular varchar(200),
telefone varchar(200),
email VARCHAR(200)

);


select * from usuarios;