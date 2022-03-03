# Mybatis
sql-file
```sql
/*
SQLyog Community v13.1.8 (64 bit)
MySQL - 8.0.26 : Database - mybatis_0325
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis_0325` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `mybatis_0325`;

/*Table structure for table `t_cat` */

DROP TABLE IF EXISTS `t_cat`;

CREATE TABLE `t_cat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cName` varchar(100) DEFAULT NULL,
  `cAge` int DEFAULT NULL,
  `cgender` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

/*Data for the table `t_cat` */

insert  into `t_cat`(`id`,`cName`,`cAge`,`cgender`) values 
(1,'%f%',2,1),
(2,'%f%',2,2),
(3,'%f%',2,1),
(4,'%f%',2,1),
(5,'%f%',2,2),
(6,'%f%',2,2),
(7,'%f%',2,1),
(8,'%f%',2,1),
(9,'%f%',2,1);

/*Table structure for table `t_employee` */

DROP TABLE IF EXISTS `t_employee`;

CREATE TABLE `t_employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empname` varchar(50) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `login_account` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb3;

/*Data for the table `t_employee` */

insert  into `t_employee`(`id`,`empname`,`gender`,`email`,`login_account`) values 
(29,'小敏',1,'xx@qq.com',NULL),
(30,'小华',2,'xx@qq.com',NULL),
(31,'小芳',1,'xx@qq.com',NULL),
(32,'小派',2,'xx@qq.com',NULL),
(33,'小可',1,'xx@qq.com',NULL),
(34,'小敏',1,'xx@qq.com',NULL),
(35,'小华',2,'xx@qq.com',NULL),
(36,'小芳',1,'xx@qq.com',NULL),
(37,'小派',2,'xx@qq.com',NULL),
(38,'小可',1,'xx@qq.com',NULL),
(39,'222',1,'xx@qq.com',NULL),
(40,'333',1,'xx@qq.com',NULL),
(41,'小敏',1,'xx@qq.com',NULL),
(42,'小华',2,'xx@qq.com',NULL),
(43,'小芳',1,'xx@qq.com',NULL),
(44,'小派',2,'xx@qq.com',NULL),
(45,'小可',1,'xx@qq.com',NULL),
(47,'小噢',1,'xx@qq.com',NULL),
(48,'小噢',1,'xx@qq.com',NULL);

/*Table structure for table `t_key` */

DROP TABLE IF EXISTS `t_key`;

CREATE TABLE `t_key` (
  `id` int NOT NULL AUTO_INCREMENT,
  `keyname` varchar(100) DEFAULT NULL,
  `lockid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_1` (`lockid`),
  CONSTRAINT `fk_1` FOREIGN KEY (`lockid`) REFERENCES `t_lock` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

/*Data for the table `t_key` */

insert  into `t_key`(`id`,`keyname`,`lockid`) values 
(1,'1号钥匙',1),
(2,'2号钥匙',2),
(3,'303钥匙1',3),
(4,'303钥匙2',3),
(5,'303钥匙3',3),
(6,'303钥匙4',3);

/*Table structure for table `t_lock` */

DROP TABLE IF EXISTS `t_lock`;

CREATE TABLE `t_lock` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lockName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

/*Data for the table `t_lock` */

insert  into `t_lock`(`id`,`lockName`) values 
(1,'1号锁'),
(2,'2号锁'),
(3,'303办公室锁');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


```
