CREATE DATABASE IF NOT EXISTS TBFerramentas;
USE TBFerramentas;
DROP TABLE IF EXISTS TBFerramentas;
CREATE TABLE TBFerramentas (
id INTEGER NOT NULL,
nome VARCHAR(100),
preco DOUBLE,
PRIMARY KEY(id)
);