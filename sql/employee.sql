/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `numbering` varchar(30) DEFAULT NULL COMMENT '员工编号',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `name` varchar(135) DEFAULT NULL COMMENT '员工姓名',
  `workplace` varchar(450) DEFAULT NULL COMMENT '员工工作地',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `car_id` int(11) DEFAULT NULL COMMENT '司机对应的车辆id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (null, '1', '陶清秋', '襄阳', '1', null);
INSERT INTO `employee` VALUES (null, '2', '甄梦琪', '南漳', '1', null);
INSERT INTO `employee` VALUES (null, '3', '军怀莲', '襄樊', '2', null);
INSERT INTO `employee` VALUES (null, '4', '卫天和', '襄樊', '3', '1');
INSERT INTO `employee` VALUES (null, '5', '洋冷萱', '襄阳', '2', null);
INSERT INTO `employee` VALUES (null, '6', '尉和雅', '南漳', '2', null);
INSERT INTO `employee` VALUES (null, '7', '奉悦远', '谷城', '2', null);
INSERT INTO `employee` VALUES (null, '8', '示灵珊', '宜城', '3', '2');
INSERT INTO `employee` VALUES (null, '9', '钱痴海', '谷城', '2', null);
INSERT INTO `employee` VALUES (null, '10', '虞碧灵', '南漳', '3', '3');
