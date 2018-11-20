/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:50:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authority
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

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `numberring` varchar(30) DEFAULT NULL COMMENT '车辆编号',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆id',
  `license_plate` varchar(20) NOT NULL COMMENT '车牌号',
  `route_id` varchar(255) NOT NULL COMMENT '路线id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (null, '1', '湘D-888888', '1');
INSERT INTO `car` VALUES (null, '2', '湘D-511314', '2');
INSERT INTO `car` VALUES (null, '3', '湘D-666666', '3');

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

-- ----------------------------
-- Table structure for path
-- ----------------------------
DROP TABLE IF EXISTS `path`;
CREATE TABLE `path` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '路线id',
  `startplace` varchar(11) NOT NULL COMMENT '起始地',
  `endplace` varchar(11) NOT NULL COMMENT '终止地',
  `priceperunit` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of path
-- ----------------------------
INSERT INTO `path` VALUES ('1', '襄樊', '保康', '20.1');
INSERT INTO `path` VALUES ('2', '襄阳', '鄂州', '30.5');
INSERT INTO `path` VALUES ('3', '宜城', '孝感', '40.5');
INSERT INTO `path` VALUES ('4', '南漳', '大悟', '50.2');
INSERT INTO `path` VALUES ('5', '谷城', '汉川', '60.2');

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

-- ----------------------------
-- Table structure for recipient
-- ----------------------------
DROP TABLE IF EXISTS `recipient`;
CREATE TABLE `recipient` (
  `numbering` varchar(30) DEFAULT NULL COMMENT '收件人编号',
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '收件人id',
  `rname` varchar(50) DEFAULT NULL COMMENT '收件人姓名',
  `rphone` varchar(50) DEFAULT NULL COMMENT '收件人电话',
  `raddress` varchar(100) DEFAULT NULL COMMENT '收件人地址',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipient
-- ----------------------------
INSERT INTO `recipient` VALUES (null, '1', '吴天', '18288881111', '湖北武汉');
INSERT INTO `recipient` VALUES (null, '2', '吴武', '18288882222', '湖北黄冈');
INSERT INTO `recipient` VALUES (null, '3', '肖潇', '18288883333', '湖北黄石');
INSERT INTO `recipient` VALUES (null, '4', '陈宇', '18288884444', '湖北十堰');
INSERT INTO `recipient` VALUES (null, '5', '陈浩', '18288885555', '湖北宜昌');
INSERT INTO `recipient` VALUES (null, '6', '王奇', '18288886666', '湖北襄阳');
INSERT INTO `recipient` VALUES (null, '7', '游鑫', '18288887777', '湖北鄂州');
INSERT INTO `recipient` VALUES (null, '8', '彭鹏', '18288888888', '湖北荆门');
INSERT INTO `recipient` VALUES (null, '9', '田夏', '18288889999', '湖北孝感');
INSERT INTO `recipient` VALUES (null, '10', '谢乔', '15386248888', '湖北咸宁');

-- ----------------------------
-- Table structure for sender
-- ----------------------------
DROP TABLE IF EXISTS `sender`;
CREATE TABLE `sender` (
  `numbering` varchar(30) DEFAULT NULL COMMENT '发件人编号',
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '发件人id',
  `sname` varchar(50) DEFAULT NULL COMMENT '发件人姓名',
  `sphone` varchar(50) DEFAULT NULL COMMENT '发件人电话',
  `saddress` varchar(100) DEFAULT NULL COMMENT '发件人地址',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sender
-- ----------------------------
INSERT INTO `sender` VALUES (null, '1', '大伟', '13333333333', '湖南长沙');
INSERT INTO `sender` VALUES (null, '2', '小宝', '15386663333', '湖南株洲');
INSERT INTO `sender` VALUES (null, '3', '王力', '15386241111', '湖南湘潭');
INSERT INTO `sender` VALUES (null, '4', '晓峰', '15386242222', '湖南岳阳');
INSERT INTO `sender` VALUES (null, '5', '小冯', '15386243333', '湖南衡阳');
INSERT INTO `sender` VALUES (null, '6', '小峰', '15386244444', '湖南邵阳');
INSERT INTO `sender` VALUES (null, '7', '萧峰', '15386245555', '湖南常德');
INSERT INTO `sender` VALUES (null, '8', '段誉', '15386246666', '湖南郴州');
INSERT INTO `sender` VALUES (null, '9', '段安', '15386247777', '湖南怀化');
INSERT INTO `sender` VALUES (null, '10', '潘森', '15386248888', '湖南永州');

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
