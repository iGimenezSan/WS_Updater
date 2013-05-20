CREATE DATABASE  IF NOT EXISTS `catalogws` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `catalogws`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: catalogws
-- ------------------------------------------------------
-- Server version	5.5.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `archivo_csv_parseado`
--

DROP TABLE IF EXISTS `archivo_csv_parseado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archivo_csv_parseado` (
  `id_fila` int(11) NOT NULL AUTO_INCREMENT,
  `familia` varchar(255) NOT NULL,
  `subfamilia` varchar(255) NOT NULL,
  `codigo` varchar(12) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombre_original` varchar(255) NOT NULL,
  `marca` varchar(32) NOT NULL,
  `descripcion_castellano` text NOT NULL,
  `link` varchar(255) NOT NULL,
  `precio` varchar(6) NOT NULL,
  `precio_tarifa` varchar(6) NOT NULL,
  `stock` varchar(2) NOT NULL,
  `stock_disponible` int(4) NOT NULL,
  `reponer` varchar(2) NOT NULL,
  `talla` varchar(8) NOT NULL,
  `iva` int(2) NOT NULL,
  `imagen_gr` varchar(120) NOT NULL,
  `imagen_bu` varchar(120) NOT NULL,
  `imagen_or` varchar(120) NOT NULL,
  `imagen_grande_1` varchar(120) NOT NULL,
  `imagen_grande_2` varchar(120) NOT NULL,
  `imagen_grande_3` varchar(120) NOT NULL,
  `imagen_grande_4` varchar(120) NOT NULL,
  `imagen_grande_5` varchar(120) NOT NULL,
  `imagen_grande_6` varchar(120) NOT NULL,
  `imagen_grande_7` varchar(120) NOT NULL,
  `imagen_grande_8` varchar(120) NOT NULL,
  `imagen_grande_9` varchar(120) NOT NULL,
  `imagen_grande_10` varchar(120) NOT NULL,
  `ean` varchar(20) DEFAULT NULL,
  `asociado_talla` varchar(12) DEFAULT NULL,
  `descripcion_html` text NOT NULL,
  `tarifa_basica` varchar(6) NOT NULL,
  `tarifa_preferente` varchar(6) NOT NULL,
  `tarifa_profesional` varchar(6) NOT NULL,
  `tarifa_premium` varchar(6) NOT NULL,
  PRIMARY KEY (`id_fila`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archivo_csv_parseado`
--

LOCK TABLES `archivo_csv_parseado` WRITE;
/*!40000 ALTER TABLE `archivo_csv_parseado` DISABLE KEYS */;
/*!40000 ALTER TABLE `archivo_csv_parseado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-05-13  0:47:54
