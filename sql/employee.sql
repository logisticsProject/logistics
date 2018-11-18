/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:09:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `workplace` varchar(150) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'Charles', 'Changsha', '1', '1');
INSERT INTO `employee` VALUES ('2', 'Mark', 'Changsha', '1', '2');
INSERT INTO `employee` VALUES ('3', 'Bill', 'Changsha', '2', '1');
INSERT INTO `employee` VALUES ('4', 'Vincent', 'Changsha', '1', '2');
INSERT INTO `employee` VALUES ('5', 'William', 'Changsha', '2', '3');
INSERT INTO `employee` VALUES ('6', 'Joseph', 'Changsha', '2', '1');
INSERT INTO `employee` VALUES ('7', 'James', 'Wuhan', '1', '3');
INSERT INTO `employee` VALUES ('8', 'Henry', 'Wuhan', '3', '1');
INSERT INTO `employee` VALUES ('9', 'Gary', 'Wuhan', '1', '3');
INSERT INTO `employee` VALUES ('10', 'Martin', 'Wuhan', '1', '1');
INSERT INTO `employee` VALUES ('11', 'Malcolm ', 'Wuhan', '3', '3');
INSERT INTO `employee` VALUES ('12', 'Joan', 'Wuhan', '1', '5');
INSERT INTO `employee` VALUES ('13', 'Niki', 'Shanghai', '1', '3');
INSERT INTO `employee` VALUES ('14', 'Betty', 'Shanghai', '3', '3');
INSERT INTO `employee` VALUES ('15', 'Linda', 'Shanghai', '2', '2');
INSERT INTO `employee` VALUES ('16', 'Whitney', 'Shanghai', '3', '3');
INSERT INTO `employee` VALUES ('17', 'Lily', 'Shanghai', '2', '3');
INSERT INTO `employee` VALUES ('18', 'Clinton', 'Shanghai', '1', '3');
INSERT INTO `employee` VALUES ('19', 'Daisy', 'Shenzhen', '2', '3');
INSERT INTO `employee` VALUES ('20', 'Jasmine ', 'Shenzhen', '3', '2');
