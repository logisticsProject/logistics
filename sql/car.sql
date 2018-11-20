/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `numberring` varchar(30) DEFAULT NULL COMMENT '车辆编号',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆id',
  `license_plate` varchar(20) NOT NULL COMMENT '车牌号',
  `route_id` varchar(255) NOT NULL COMMENT '路线id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (null, '1', '湘D-888888', '1');
INSERT INTO `car` VALUES (null, '2', '湘D-511314', '2');
INSERT INTO `car` VALUES (null, '3', '湘D-666666', '3');
