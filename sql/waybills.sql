/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:42:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for waybills
-- ----------------------------
DROP TABLE IF EXISTS `waybills`;
CREATE TABLE `waybills` (
  `w_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '运单状态id',
  `state` varchar(255) DEFAULT NULL COMMENT '状态名称',
  `byte1` varchar(255) DEFAULT NULL COMMENT '备用',
  `byte2` int(255) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of waybills
-- ----------------------------
INSERT INTO `waybills` VALUES ('1', '待发运单', null, null);
INSERT INTO `waybills` VALUES ('2', '未到运单', null, null);
INSERT INTO `waybills` VALUES ('3', '未结运单', null, null);
INSERT INTO `waybills` VALUES ('4', '已结运单', null, null);
