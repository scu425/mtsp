/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.19 : Database - mtsp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mtsp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mtsp`;

/*Table structure for table `about` */

DROP TABLE IF EXISTS `about`;

CREATE TABLE `about` (
  `about_id` int(10) NOT NULL AUTO_INCREMENT,
  `aboutEN` varchar(1000) NOT NULL,
  `aboutCN` varchar(1000) NOT NULL,
  PRIMARY KEY (`about_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `about` */

insert  into `about`(`about_id`,`aboutEN`,`aboutCN`) values (1,'1204210','第三个梵蒂冈的非官方');

/*Table structure for table `answerdetailstu` */

DROP TABLE IF EXISTS `answerdetailstu`;

CREATE TABLE `answerdetailstu` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `exam_id` int(20) NOT NULL,
  `answer` varchar(200) NOT NULL,
  `score` int(10) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `answerdetailstu` */

insert  into `answerdetailstu`(`id`,`user_id`,`exam_id`,`answer`,`score`,`create_time`) values (1,1,1,'A B C D A B C C C C',100,'2017-12-29 09:29:03'),(3,1,2,'A B C D A B C C C C',100,'2017-12-29 09:29:07'),(4,1,2,'A B C D A B C D B B',70,'2017-12-29 09:36:36'),(5,1,2,'B C B B A A,B,C C C B B',30,'2017-12-29 14:54:20'),(6,1,2,'B C  C C C  C C ',20,'2018-01-02 16:58:26');

/*Table structure for table `donate` */

DROP TABLE IF EXISTS `donate`;

CREATE TABLE `donate` (
  `donate_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`donate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `donate` */

insert  into `donate`(`donate_id`,`title`,`content`) values (1,'大范甘迪','的非官方的');

/*Table structure for table `exam` */

DROP TABLE IF EXISTS `exam`;

CREATE TABLE `exam` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `whichplan` varchar(10) NOT NULL,
  `round` varchar(10) DEFAULT NULL,
  `answer` varchar(300) DEFAULT NULL,
  `group` varchar(20) NOT NULL,
  `year` int(10) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `exam` */

insert  into `exam`(`id`,`whichplan`,`round`,`answer`,`group`,`year`,`create_time`) values (1,'a','1','','',2017,'2018-01-04 16:26:02');

/*Table structure for table `manager` */

DROP TABLE IF EXISTS `manager`;

CREATE TABLE `manager` (
  `manager_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `manager` */

insert  into `manager`(`manager_id`,`name`,`password`) values (1,'admin','123456'),(2,'zhc','123456');

/*Table structure for table `people` */

DROP TABLE IF EXISTS `people`;

CREATE TABLE `people` (
  `people_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nameEN` varchar(45) NOT NULL,
  `nameCN` varchar(45) NOT NULL,
  `introductionEN` varchar(255) NOT NULL,
  `introductionCN` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  PRIMARY KEY (`people_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `people` */

insert  into `people`(`people_id`,`nameEN`,`nameCN`,`introductionEN`,`introductionCN`,`photo`) values (1,'zhc','朱汉成','fmjhdsfbdjksfhd','性别的健康快乐的少年副科级','1');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacher_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `loginname` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `school` varchar(45) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `loginname` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` char(3) NOT NULL,
  `school` varchar(100) NOT NULL,
  `grade` varchar(10) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`email`,`loginname`,`username`,`password`,`age`,`gender`,`school`,`grade`) values (1,'zhc@163.com','zhc','zhc','123456',18,'boy','盐城一中','九');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
