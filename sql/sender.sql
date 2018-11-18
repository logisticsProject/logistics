/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:10:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sender`
-- ----------------------------
DROP TABLE IF EXISTS `sender`;
CREATE TABLE `sender` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(50) DEFAULT NULL,
  `sphone` varchar(50) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sender
-- ----------------------------
INSERT INTO `sender` VALUES ('1', '大伟', '13333333333', '湖南长沙');
INSERT INTO `sender` VALUES ('2', '小宝', '15386663333', '湖南株洲');
INSERT INTO `sender` VALUES ('3', '王力', '15386241111', '湖南湘潭');
INSERT INTO `sender` VALUES ('4', '晓峰', '15386242222', '湖南岳阳');
INSERT INTO `sender` VALUES ('5', '小冯', '15386243333', '湖南衡阳');
INSERT INTO `sender` VALUES ('6', '小峰', '15386244444', '湖南邵阳');
INSERT INTO `sender` VALUES ('7', '萧峰', '15386245555', '湖南常德');
INSERT INTO `sender` VALUES ('8', '段誉', '15386246666', '湖南郴州');
INSERT INTO `sender` VALUES ('9', '段安', '15386247777', '湖南怀化');
INSERT INTO `sender` VALUES ('10', '潘森', '15386248888', '湖南永州');
