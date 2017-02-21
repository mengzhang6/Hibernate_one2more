/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : hibernate_one2more

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-02-21 22:27:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `gid` int(11) NOT NULL,
  `gname` varchar(20) NOT NULL,
  `gdesc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL,
  `sname` varchar(20) NOT NULL,
  `sex` char(2) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `fk_student_id` (`gid`),
  CONSTRAINT `fk_student_id` FOREIGN KEY (`gid`) REFERENCES `grade` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
