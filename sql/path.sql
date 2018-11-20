/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for path
-- ----------------------------
DROP TABLE IF EXISTS `path`;
CREATE TABLE `path` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '路线id',
  `startplace` varchar(11) NOT NULL COMMENT '起始地',
  `endplace` varchar(11) NOT NULL COMMENT '终止地',
  `priceperunit` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of path
-- ----------------------------
INSERT INTO `path` VALUES ('1', '襄樊', '保康', '20.1');
INSERT INTO `path` VALUES ('2', '襄阳', '鄂州', '30.5');
INSERT INTO `path` VALUES ('3', '宜城', '孝感', '40.5');
INSERT INTO `path` VALUES ('4', '南漳', '大悟', '50.2');
INSERT INTO `path` VALUES ('5', '谷城', '汉川', '60.2');
