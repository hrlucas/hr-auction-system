-- =========================================================
-- Projeto: hr-auction-system
-- Arquivo: init.sql
-- Descricao: criacao da base de dados, estrutura da tabela
--            de produtos e carga inicial de dados
-- =========================================================

CREATE DATABASE IF NOT EXISTS hr_auction_system
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE hr_auction_system;

CREATE TABLE IF NOT EXISTS produtos (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

INSERT INTO produtos (nome, valor, status)
SELECT 'PS4', 1500.00, 'Vendido'
WHERE NOT EXISTS (
    SELECT 1 FROM produtos WHERE nome = 'PS4' AND valor = 1500.00 AND status = 'Vendido'
);

INSERT INTO produtos (nome, valor, status)
SELECT 'Xbox 360', 800.00, 'Vendido'
WHERE NOT EXISTS (
    SELECT 1 FROM produtos WHERE nome = 'Xbox 360' AND valor = 800.00 AND status = 'Vendido'
);

INSERT INTO produtos (nome, valor, status)
SELECT 'iPhone 12', 4800.00, 'Vendido'
WHERE NOT EXISTS (
    SELECT 1 FROM produtos WHERE nome = 'iPhone 12' AND valor = 4800.00 AND status = 'Vendido'
);

INSERT INTO produtos (nome, valor, status)
SELECT 'PS2', 400.00, 'A Venda'
WHERE NOT EXISTS (
    SELECT 1 FROM produtos WHERE nome = 'PS2' AND valor = 400.00 AND status = 'A Venda'
);
