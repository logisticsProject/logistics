/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-20 09:41:55
*/

SET FOREIGN_KEY_CHECKS=0;

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
