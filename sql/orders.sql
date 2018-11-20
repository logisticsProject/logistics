/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `numberring` varchar(30) DEFAULT NULL COMMENT '订单编号',
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sendor_id` int(10) DEFAULT NULL COMMENT '发件人',
  `receiver_id` int(10) DEFAULT NULL COMMENT '收件人',
  `state_id` int(10) DEFAULT NULL COMMENT '状态id',
  `isPayed` int(2) DEFAULT NULL COMMENT '是否付款',
  `pay_way` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '付款方式',
  `payment` double(20,2) DEFAULT NULL COMMENT '运费',
  `weight` double(20,2) DEFAULT NULL COMMENT '重量',
  `start_time` datetime DEFAULT NULL COMMENT '发货日期',
  `fill_date` datetime DEFAULT NULL COMMENT '填写日期',
  `forward_arrive_time` datetime DEFAULT NULL COMMENT '预期到达时间',
  `end_time` datetime DEFAULT NULL COMMENT '实际到达时间',
  `driver_id` int(10) DEFAULT NULL COMMENT '司机id',
  `receivables_rate` double(60,0) DEFAULT NULL COMMENT '代收手续费率',
  `receivables` double(20,0) DEFAULT NULL COMMENT '代收货款',
  `subtraction` double(50,0) DEFAULT NULL COMMENT '减款',
  `staff_id` int(50) DEFAULT NULL COMMENT '填票人',
  `delivery_fee` double(50,0) DEFAULT NULL COMMENT '送货费',
  `remark` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `insurance` double(50,0) DEFAULT NULL COMMENT '保险费',
  `by1` int(20) DEFAULT NULL,
  `by2` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `amouet` int(50) DEFAULT NULL COMMENT '件数',
  `volume` double(50,0) DEFAULT NULL COMMENT '体积',
  `goods_value` double(50,0) DEFAULT NULL COMMENT '货物价值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (null, '1', '1', '1', '1', '0', '0', '100.00', '50.00', '2018-11-04 14:45:21', null, '2018-11-07 14:45:25', '2018-11-07 14:45:33', null, null, null, null, null, null, null, null, null, null, null, null, null);
