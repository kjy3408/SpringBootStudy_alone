CREATE DATABASE  IF NOT EXISTS `board` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `board`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: board
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `board_mst`
--

DROP TABLE IF EXISTS `board_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board_mst` (
  `board_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` varchar(45) NOT NULL,
  `member_id` int NOT NULL,
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board_mst`
--

LOCK TABLES `board_mst` WRITE;
/*!40000 ALTER TABLE `board_mst` DISABLE KEYS */;
INSERT INTO `board_mst` VALUES (1,'제목1','내용1',1),(2,'제목2','내용2',1),(3,'제목3','내용3',2),(4,'제목4','내용4',2),(5,'제목5','내용5',2),(6,'제목6','내용6',3),(7,'제목7','내용7',4),(8,'제목8','내용8',4),(9,'제목9','내용9',5),(10,'제목10','내용10',6);
/*!40000 ALTER TABLE `board_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member_mst`
--

DROP TABLE IF EXISTS `member_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member_mst` (
  `member_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_mst`
--

LOCK TABLES `member_mst` WRITE;
/*!40000 ALTER TABLE `member_mst` DISABLE KEYS */;
INSERT INTO `member_mst` VALUES (1,'aaa','1234'),(2,'bbb','1234'),(3,'ccc','1234'),(4,'ddd','1234'),(5,'eee','1234'),(6,'fff','1234');
/*!40000 ALTER TABLE `member_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'board'
--

--
-- Dumping routines for database 'board'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-16 17:14:44
