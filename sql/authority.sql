/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:09:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authority`
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `name` varchar(50) DEFAULT NULL,
  `descr` varchar(50) DEFAULT NULL,
  `by1` varchar(30) DEFAULT NULL COMMENT '备用',
  `by2` bigint(20) DEFAULT NULL COMMENT '备用2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('0', 'ROLE_ADMIN', '超级管理员', null, null);
INSERT INTO `authority` VALUES ('1', 'ROLE_USER', '普通管理员', null, null);
INSERT INTO `authority` VALUES ('2', 'ROLE_USER', '工作人员', null, null);
INSERT INTO `authority` VALUES ('3', 'ROLE_USER', '司机', null, null);
INSERT INTO `authority` VALUES ('4', 'ROLE_USER', '客户', null, null);
