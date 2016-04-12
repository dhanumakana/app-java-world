-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.34-community - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for kbdb
DROP DATABASE IF EXISTS `kbdb`;
CREATE DATABASE IF NOT EXISTS `kbdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `kbdb`;


-- Dumping structure for table kbdb.kb_member
DROP TABLE IF EXISTS `kb_member`;
CREATE TABLE IF NOT EXISTS `kb_member` (
  `id` int(8) NOT NULL,
  `kbmid` varchar(64) NOT NULL,
  `first_name` varchar(15) NOT NULL,
  `middle_name` varchar(15) DEFAULT NULL,
  `last_name` varchar(15) NOT NULL,
  `tag_id` varchar(64) NOT NULL,
  `status` varchar(64) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_user` varchar(64) DEFAULT NULL,
  `last_updated_date` date DEFAULT NULL,
  `last_updated_user` varchar(64) DEFAULT NULL,
  `tower_id` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tower_member_fk1` (`tower_id`),
  CONSTRAINT `tower_member_fk1` FOREIGN KEY (`tower_id`) REFERENCES `kb_tower` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kbdb.kb_member: ~0 rows (approximately)
/*!40000 ALTER TABLE `kb_member` DISABLE KEYS */;
/*!40000 ALTER TABLE `kb_member` ENABLE KEYS */;


-- Dumping structure for table kbdb.kb_tower
DROP TABLE IF EXISTS `kb_tower`;
CREATE TABLE IF NOT EXISTS `kb_tower` (
  `id` int(8) NOT NULL,
  `tower_name` varchar(64) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kbdb.kb_tower: ~1 rows (approximately)
/*!40000 ALTER TABLE `kb_tower` DISABLE KEYS */;
/*!40000 ALTER TABLE `kb_tower` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
