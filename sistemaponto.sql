CREATE DATABASE sistemaponto;

USE sistemaponto;

CREATE TABLE usuario(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    usuario VARCHAR(200),
    senha VARCHAR(200),
    tipo VARCHAR(200)
);

INSERT INTO usuario (usuario, senha, tipo) VALUES 
('admin', 'admin', 'Admin');

SELECT * FROM usuario;