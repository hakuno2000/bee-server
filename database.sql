CREATE DATABASE  IF NOT EXISTS `bee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bee`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bee
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,'Van','0911123456','1','nowhere',1),(2,'Nguyen Linh','0866123456','1','somewhere',1),(3,'Truong','0478123456','1','unknown',1),(4,'Luu','0119123456','1','void',0);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `item` varchar(255) NOT NULL,
  `value` bigint NOT NULL,
  `weight` double NOT NULL,
  `description` varchar(255) NOT NULL,
  `status` bit(1) NOT NULL,
  `sender_name` varchar(255) NOT NULL,
  `sender_phone` varchar(255) NOT NULL,
  `sender_address` varchar(255) NOT NULL,
  `receiver_name` varchar(255) NOT NULL,
  `receiver_phone` varchar(255) NOT NULL,
  `receiver_address` varchar(255) NOT NULL,
  `ordered_date` date NOT NULL,
  `sent_date` date NOT NULL,
  `received_date` date NOT NULL,
  `shipper_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8t9ke0lw37rqfkwosmokfpycb` (`shipper_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Something',300,10,'Some description',_binary '','Nguyen Long','0763123456','Thai Binh','Hoai Man','0423123456','Ho Chi Minh','2021-06-04','2021-06-04','2021-06-04',3),(2,'Something special',550,30,'Some special description',_binary '\0','Vu Tuan','0244123456','Yen Bai','Nguyen Binh','0627123456','Bac Giang','2021-06-04','2021-06-04','2021-06-04',1),(3,'Something mystery',2000,5,'Some mystery description',_binary '\0','Trinh Hung','0623123456','Phu Tho','Duc Long','0176123456','Ha Noi','2021-06-04','2021-06-04','2021-06-04',3),(4,'Something cool',150,25,'Some cool description',_binary '\0','Hoai Thuong','0253123456','Kien Giang','Tran Hung','0656123456','Ha Giang','2021-06-04','2021-06-04','2021-06-04',1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-04  5:43:12
