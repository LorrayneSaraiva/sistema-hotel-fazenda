create database hotel;

use hotel;

create table hospedar(

hosp_nome varchar(15),
descricao varchar(400),
ocupa_max integer(10),
preco double
);

insert into hospedar (hosp_nome,descricao,ocupa_max,preco) values ("Quarto","suite, WIFI, ar-condicionado, Serviço de quarto e café da manhâ incluso",10,350);
insert into hospedar (hosp_nome,descricao,ocupa_max,preco) values ("Chale","suite, WIFI, ar-condicionado, Serviço de quarto e café da manhâ incluso, Cama de solteiro, Lareira, Copa gourmet",10,450);
insert into hospedar (hosp_nome,descricao,ocupa_max,preco) values ("Cabana","suite, WIFI, ar-condicionado, Serviço de quarto e café da manhâ incluso, Cama casal king size,Lareira, Copa gourmet",10,550);

drop table hospedar;
select * from hospedar;

create table reserva(
 id int auto_increment primary key NOT NULL,
 nome_cli varchar(300),
 nome_quarto varchar(20),
 data_inicial varchar(20),
 data_final varchar(20),	
 qnt_dias int
 );
 
 drop table reserva;

create table operador(
id int auto_increment primary key NOT NULL,
nome varchar(20),
email varchar(30),
senha varchar(20),
cpf varchar(20),
rg varchar(20),
salario double
); 

insert into operador(nome,email,senha,cpf,rg,salario) values ("Guilherme","guibolao@gmail.com","guibola","8888888-88","707070-70",1000.05);
insert into operador(nome,email,senha,cpf,rg,salario) values ("LOLA","guibolao@gmail.com","guibola","8888888-88","707070-70",1000.05);

drop table operador;
select * from operador;

delete  from operador where id = 2;
