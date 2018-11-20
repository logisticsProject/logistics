/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for receipt_order
-- ----------------------------
DROP TABLE IF EXISTS `receipt_order`;
CREATE TABLE `receipt_order` (
  `numbering` varchar(30) DEFAULT NULL COMMENT '回执单编号',
  `rc_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '回执单id',
  `state` varchar(20) DEFAULT NULL COMMENT '回执单状态',
  `contract_id` varchar(20) DEFAULT NULL COMMENT '合同id',
  PRIMARY KEY (`rc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of receipt_order
-- ----------------------------
