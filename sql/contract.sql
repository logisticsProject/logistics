/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `numbering` varchar(30) DEFAULT NULL COMMENT '合同编号',
  `c_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '合同id',
  `state` varchar(20) DEFAULT NULL COMMENT '合同状态',
  `order_id` varchar(10) DEFAULT NULL COMMENT '订单id',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of contract
-- ----------------------------
