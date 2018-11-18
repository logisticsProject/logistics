/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:10:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(20) NOT NULL,
  `sendor_id` int(10) DEFAULT NULL,
  `receiver_id` int(10) DEFAULT NULL,
  `state_id` int(10) DEFAULT NULL,
  `isPayed` int(2) DEFAULT NULL,
  `pay_way` varchar(10) DEFAULT NULL,
  `payment` double(20,2) DEFAULT NULL,
  `weight` double(20,2) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `forward_arrive_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `transfer_staff_id_1` int(10) DEFAULT NULL,
  `transfer_staff_id_2` int(10) DEFAULT NULL,
  `transfer_staff_id_3` int(10) DEFAULT NULL,
  `driver_id` int(10) DEFAULT NULL,
  `picker_id` int(10) DEFAULT NULL,
  `couier_id` int(10) DEFAULT NULL,
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `by1` int(20) DEFAULT NULL,
  `by2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of orders
-- ----------------------------
