-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 22-Jan-2015 às 23:07
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `serraria`
--
CREATE DATABASE IF NOT EXISTS `serraria` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `serraria`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE IF NOT EXISTS `empresa` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `razao_social` VARCHAR(255) NULL,
  `nome_fantasia` VARCHAR(255) NULL,
  `cnpj` VARCHAR(14) NOT NULL,
  `inscricao_estadual` VARCHAR(20) NULL,
  `inscricao_municipal` VARCHAR(20) NULL,
  `email` VARCHAR(100) NULL,
  `telefone` VARCHAR(14) NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cnpj` varchar(14) NOT NULL,
  `divida` float(10,2) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `especura` float NOT NULL,
  `largura` float NOT NULL,
  `comprimento` float NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `romaneio`
--

CREATE TABLE IF NOT EXISTS `romaneio` (
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `transportador` varchar(100) NOT NULL,
  `motorista` varchar(100) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `cli_codigo` int(11) NOT NULL,
  `pecas_total` int(11) NOT NULL,
  `metros_total` float NOT NULL,
  `media_valor` float NOT NULL,
  `valor_total` float(10,2) NOT NULL,
  `valor_pago` float(10,2) NOT NULL,
  `emp_codigo` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `cli_codigo` (`cli_codigo`),
  KEY `emp_codigo` (`emp_codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `romaneio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_romaneio`
--

CREATE TABLE IF NOT EXISTS `itens_romaneio` (
  `numero_romaneio` int(11) NOT NULL,
  `sequencia` int(11) NOT NULL,
  `codigo_produto` int(11) NOT NULL,
  `valor_unit` float(10,2) NOT NULL,
  `produto` varchar(150) NOT NULL,
  `especura` float NOT NULL,
  `largura` float NOT NULL,
  `comprimento` float NOT NULL,
  `num_pecas` int(5) NOT NULL,
  `metros` float NOT NULL,
  `total` float(10,2) NOT NULL,
  `tipo` varchar(4) NOT NULL,
  UNIQUE KEY `numero_romaneio` (`numero_romaneio`,`sequencia`),
  KEY `codigo_produto` (`codigo_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `itens_romaneio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE IF NOT EXISTS `pagamento` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `cli_codigo` int(11) NOT NULL,
  `valor_pago` float(10,2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pagamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `toras`
--

CREATE TABLE IF NOT EXISTS `toras` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `peso` float NOT NULL,
  `valor` decimal(10,2) NOT NULL,
  `valor_pago` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `total_geral` decimal(10,2) NOT NULL,
  `cli_codigo` int(11) DEFAULT NULL,
  `emp_codigo` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cli_codigo` (`cli_codigo`),
  KEY `emp_codigo` (`emp_codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `toras`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `nome`, `login`, `senha`) VALUES (1, 'Admin', 'admin', '21232f297a57a5a743894a0e4a801fc3');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `itens_romaneio`
--
ALTER TABLE `itens_romaneio`
  ADD CONSTRAINT `itens_romaneio_numero_fk` FOREIGN KEY (`numero_romaneio`) REFERENCES `romaneio` (`numero`),
  ADD CONSTRAINT `itens_romaneio_produto_fk` FOREIGN KEY (`codigo_produto`) REFERENCES `produto` (`codigo`);

--
-- Limitadores para a tabela `romaneio`
--
ALTER TABLE `romaneio`
  ADD CONSTRAINT `romaneio_cliente_fk` FOREIGN KEY (`cli_codigo`) REFERENCES `cliente` (`codigo`),
  ADD CONSTRAINT `romaneio_empresa_fk` FOREIGN KEY (`emp_codigo`) REFERENCES `empresa` (`codigo`);

--
-- Limitadores para a tabela `toras`
--
ALTER TABLE `toras`
  ADD CONSTRAINT `toras_cliente_fk` FOREIGN KEY (`cli_codigo`) REFERENCES `cliente` (`codigo`),
  ADD CONSTRAINT `toras_empresa_fk` FOREIGN KEY (`emp_codigo`) REFERENCES `empresa` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
