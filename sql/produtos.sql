-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.5.38-0ubuntu0.14.04.1 - (Ubuntu)
-- OS do Servidor:               debian-linux-gnu
-- HeidiSQL Versão:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura para tabela serraria_teste.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `especura` float NOT NULL,
  `largura` float NOT NULL,
  `comprimento` float NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela serraria_teste.produto: ~24 rows (aproximadamente)
DELETE FROM `produto`;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` (`codigo`, `descricao`, `especura`, `largura`, `comprimento`) VALUES
	(1, 'Madeira seca', 25, 75, 3000),
	(2, 'Madeira limpa', 25, 50, 2000),
	(3, 'Pinus bruto', 30, 200, 3000),
	(4, 'Taboa bruta', 25, 125, 3000),
	(5, 'Taboa de 30', 20, 275, 3000),
	(6, 'Pranchas de pinus-Seca', 35, 150, 3000),
	(7, 'Madeira bruta', 25, 50, 3000),
	(8, 'Madeira verde', 25, 50, 3000),
	(9, 'Madeira para tratar(nossa)', 95, 95, 2200),
	(10, 'Madeira para tratar', 20, 67, 1300),
	(11, 'Madeira para secar', 42, 55, 3000),
	(12, 'Madeira de 30', 20, 250, 3000),
	(13, 'Madeira bruta limpa', 25, 50, 3000),
	(14, 'Madeira bruta verde', 25, 50, 3000),
	(15, 'Madeira bruta seca', 25, 75, 3000),
	(16, 'Eucalipto bruto', 25, 100, 3000),
	(17, 'Estoque madeira verde', 25, 50, 3000),
	(18, 'Chassi-reto', 20, 40, 2700),
	(19, 'Chassi-Painel', 20, 40, 2700),
	(20, 'Chassi-lousa 2', 20, 35, 3000),
	(21, 'Chassi-DU', 20, 40, 2700),
	(22, 'Chassi-CH', 20, 50, 2700),
	(23, 'Chassi', 15, 30, 2700),
	(24, 'Assoalho', 20, 90, 2500);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
