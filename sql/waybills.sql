/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:11:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `waybills`
-- ----------------------------
DROP TABLE IF EXISTS `waybills`;
CREATE TABLE `waybills` (
  `w_id` int(11) NOT NULL,
  `state` varchar(255) DEFAULT NULL,
  `byte1` varchar(255) DEFAULT NULL,
  `byte2` int(255) DEFAULT NULL,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of waybills
-- ----------------------------
INSERT INTO `waybills` VALUES ('1', '待发运单', null, null);
INSERT INTO `waybills` VALUES ('2', '未到运单', null, null);
INSERT INTO `waybills` VALUES ('3', '未结运单', null, null);
INSERT INTO `waybills` VALUES ('4', '已结运单', null, null);
