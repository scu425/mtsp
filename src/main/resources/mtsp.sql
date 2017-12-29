/*
Navicat MySQL Data Transfer

Source Server         : zhc_cool
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : mtsp

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-12-29 14:48:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `about`
-- ----------------------------
DROP TABLE IF EXISTS `about`;
CREATE TABLE `about` (
  `about_id` int(10) NOT NULL AUTO_INCREMENT,
  `titleEN` varchar(255) NOT NULL,
  `titleCN` varchar(255) NOT NULL,
  `aboutEN` varchar(1000) NOT NULL,
  `aboutCN` varchar(1000) NOT NULL,
  PRIMARY KEY (`about_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of about
-- ----------------------------
INSERT INTO `about` VALUES ('1', 'About', '标题', 'Founded in 2017, the math talent search program is a non-profit program helping K-12 kids explore and foster a love for mathematics. We realize that mathematically gifted students show their strength in many ways. Some may be gifted in fast problem-solving; some may be in research or recreational math.  Some enjoys the competitive atmosphere, while other not. The program aims at inspiring a life-long curiosity for mathematics by creatively solving math problems or discovering math ideas or laws from an early age. Borrowed ideas from many existing projects of similar kind, such as the Wisconsin math talent search, and the Global math project, we currently offer two ways to help kids identify their math capacity.  ', '测试1');

-- ----------------------------
-- Table structure for `donate`
-- ----------------------------
DROP TABLE IF EXISTS `donate`;
CREATE TABLE `donate` (
  `donate_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `titleEN` varchar(45) NOT NULL,
  `contentEN` varchar(1000) NOT NULL,
  `titleCN` varchar(45) NOT NULL,
  `contentCN` varchar(1000) NOT NULL,
  PRIMARY KEY (`donate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of donate
-- ----------------------------
INSERT INTO `donate` VALUES ('1', 'Forest QIN donate much money to our school.', 'totla $10000', '秦森林', '100万');
INSERT INTO `donate` VALUES ('2', 'zhuGOD is husband.', 'total $1000', '朱汉成', '100');
INSERT INTO `donate` VALUES ('3', 'qin2', '￥20', '秦森林1', '10001');
INSERT INTO `donate` VALUES ('4', 'qin3', '￥20', '秦森林', '111');

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `manager_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `loginname` varchar(45) NOT NULL DEFAULT '',
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------

-- ----------------------------
-- Table structure for `people`
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `people_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nameEN` varchar(45) NOT NULL,
  `nameCN` varchar(45) NOT NULL,
  `introductionEN` varchar(1000) NOT NULL,
  `introductionCN` varchar(1000) NOT NULL,
  `photo` varchar(255) NOT NULL,
  PRIMARY KEY (`people_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of people
-- ----------------------------
INSERT INTO `people` VALUES ('1', 'Dr. Yun-zhi Zou', 'zou ', 'Professor of mathematics at Sichuan University, China. He is an award winning faculty at his university and an advocate for cross culture learning. He authored several books in English including 4 calculus textbooks and coauthored the book “American Mathematical Contests: A guide to Success”.', 'aa', 'people1.jpg');
INSERT INTO `people` VALUES ('2', 'Forest Qin', 'QinSenlin', 'Nice man.Gilrs like him.', '他是个好男人', '秦森林.jpg');
INSERT INTO `people` VALUES ('3', 'MESSI Zhu', '朱汉成', 'Famous football player.He won the World Cup four times', '著名足球队员', '朱汉成.jpg');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `loginname` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `school` varchar(45) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `loginname` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` char(45) NOT NULL,
  `school` varchar(100) NOT NULL,
  `grade` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhc', '朱汉成', '123456', '11', '男', '七中', '高二', 'zhc@163.com');
INSERT INTO `user` VALUES ('2', 'qsl', '秦森林', '123456', '11', '男', '二中', '高一', 'qsl@163.com');
INSERT INTO `user` VALUES ('3', 'yq', '叶情', '123456', '11', '女', '一中', '高三', 'yq@163.com');
INSERT INTO `user` VALUES ('5', 'suhong', '&#33487;&#23439;', '123456', '11', '&#30007;', '&#19977;&#20013;', '&#39640;&#19977;', 'sh@163.com');
INSERT INTO `user` VALUES ('6', 'suhong', '&#33487;&#23439;', '123', '11', '&#30007;', '&#19977;&#20013;', '&#39640;&#19977;', 'sh@163.com');
INSERT INTO `user` VALUES ('7', 'suhong', '&#33487;&#23439;', '111', '11', '&#30007;', '&#19977;&#20013;', '&#39640;&#19977;', 'sh@163.com');
INSERT INTO `user` VALUES ('8', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `user` VALUES ('9', 'aa', 'aa', 'aaa', '11', 'a', 'da', 'aa', 'aa');
INSERT INTO `user` VALUES ('10', 'cyb', '曹亚波', '123456', '22', '男', '市二中', '初一', 'cyb@163.com');
