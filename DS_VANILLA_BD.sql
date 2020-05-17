CREATE database ds_vanilla;
use ds_vanilla;
create table usuarios(
id int primary key,
login varchar(20)  unique,
senha varchar(20)

);
CREATE TABLE empresa(
id INT PRIMARY KEY AUTO_INCREMENT,
razao_social VARCHAR(100) unique,
nome_fantasia varchar(100) ,
cnpj VARCHAR(50) unique,
rua VARCHAR(50),
referencia VARCHAR(100)
);
create table vaga(
cod_vaga int primary key auto_increment,
tipo_oportunidade varchar(50),
curso varchar(50),
requisitos varchar(200),
beneficios varchar(200),
hora varchar(5),
local_vaga varchar(50),
tipoVaga VARCHAR(40),
salario FLOAT(3,2),
cargo VARCHAR(20),
horario VARCHAR(4)
);

alter table vaga
CHARACTER SET = utf8 , ENGINE = InnoDB;


alter table vaga
CHARACTER SET = utf8 , ENGINE = InnoDB ;

alter table empresa
CHARACTER SET = utf8 , ENGINE = InnoDB ;

insert into usuarios values(1,"deborafsm","12345");

select * from login;
select * from empresa;
