/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : logistics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-18 16:10:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `recipient`
-- ----------------------------
DROP TABLE IF EXISTS `recipient`;
CREATE TABLE `recipient` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(50) DEFAULT NULL,
  `rphone` varchar(50) DEFAULT NULL,
  `raddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipient
-- ----------------------------
INSERT INTO `recipient` VALUES ('1', '吴天', '18288881111', '湖北武汉');
INSERT INTO `recipient` VALUES ('2', '吴武', '18288882222', '湖北黄冈');
INSERT INTO `recipient` VALUES ('3', '肖潇', '18288883333', '湖北黄石');
INSERT INTO `recipient` VALUES ('4', '陈宇', '18288884444', '湖北十堰');
INSERT INTO `recipient` VALUES ('5', '陈浩', '18288885555', '湖北宜昌');
INSERT INTO `recipient` VALUES ('6', '王奇', '18288886666', '湖北襄阳');
INSERT INTO `recipient` VALUES ('7', '游鑫', '18288887777', '湖北鄂州');
INSERT INTO `recipient` VALUES ('8', '彭鹏', '18288888888', '湖北荆门');
INSERT INTO `recipient` VALUES ('9', '田夏', '18288889999', '湖北孝感');
INSERT INTO `recipient` VALUES ('10', '谢乔', '15386248888', '湖北咸宁');
