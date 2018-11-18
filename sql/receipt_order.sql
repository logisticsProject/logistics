/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:10:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `receipt_order`
-- ----------------------------
DROP TABLE IF EXISTS `receipt_order`;
CREATE TABLE `receipt_order` (
  `rc_id` varchar(20) NOT NULL,
  `state` varchar(20) DEFAULT NULL,
  `contract_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of receipt_order
-- ----------------------------
