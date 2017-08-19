/*
Navicat MySQL Data Transfer

Source Server         : LocalMySQL
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : ecommerce

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-08-17 13:45:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('0', 'food', null, null);
INSERT INTO `category` VALUES ('1', 'car', null, null);
INSERT INTO `category` VALUES ('2', 'milk', null, null);
INSERT INTO `category` VALUES ('3', 'feed', null, null);
INSERT INTO `category` VALUES ('4', 'tivi', null, null);
INSERT INTO `category` VALUES ('5', 'sofa', null, null);
INSERT INTO `category` VALUES ('6', 'bike', null, null);
INSERT INTO `category` VALUES ('7', 'phone', null, null);
INSERT INTO `category` VALUES ('8', 'book', null, null);
INSERT INTO `category` VALUES ('9', 'closed', null, null);
INSERT INTO `category` VALUES ('10', 'byclyce', null, null);
INSERT INTO `category` VALUES ('11', 'game', null, null);
INSERT INTO `category` VALUES ('12', 'toy', null, null);
INSERT INTO `category` VALUES ('13', 'windown', null, null);
INSERT INTO `category` VALUES ('14', 'computer', null, null);
INSERT INTO `category` VALUES ('15', 'carem', null, null);
INSERT INTO `category` VALUES ('16', 'socola', null, null);
INSERT INTO `category` VALUES ('17', 'pan', null, null);

-- ----------------------------
-- Table structure for favorite
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite` (
  `favorite_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`favorite_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of favorite
-- ----------------------------
INSERT INTO `favorite` VALUES ('1', '1', '1', '1', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('2', '2', '2', '2', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('3', '3', '3', '1', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('4', '4', '4', '4', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('5', '5', '5', '2', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('6', '6', '6', '5', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('7', '7', '7', '3', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('8', '8', '8', '4', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('9', '9', '9', '2', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('10', '10', '10', '1', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('11', '11', '11', '3', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('12', '12', '12', '2', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('13', '13', '13', '5', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('14', '14', '14', '4', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('15', '15', '15', '3', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('16', '16', '16', '2', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `favorite` VALUES ('17', '17', '17', '1', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `image_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `color` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(11) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('1', '1', 'blue', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('2', '2', 'red', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('3', '3', 'green', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('4', '4', 'color', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('5', '5', 'blue', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('6', '6', 'red', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('7', '7', 'green', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('8', '8', 'color', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('9', '9', 'blue', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('10', '10', 'red', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('11', '11', 'green', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('12', '12', 'color', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('13', '13', 'blue', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('14', '14', 'red', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('15', '15', 'green', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('16', '16', 'color', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `image` VALUES ('17', '17', 'blue', 'abcabc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `store_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `property` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `price` float(11,0) DEFAULT NULL,
  `discount` float(11,0) DEFAULT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '1', '1', 'Book', 'story', '20', '50000', '0', '2017-08-16 15:00:06', '2017-08-16 15:00:06');

-- ----------------------------
-- Table structure for review
-- ----------------------------
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `review_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_unicode_ci,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`review_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of review
-- ----------------------------
INSERT INTO `review` VALUES ('1', '1', '1', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('2', '2', '2', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('3', '3', '3', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('4', '4', '4', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('5', '5', '5', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('6', '6', '6', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('7', '7', '7', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('8', '8', '8', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('9', '9', '9', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('10', '10', '10', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('11', '11', '11', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('12', '12', '12', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('13', '13', '13', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('14', '14', '14', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('15', '15', '15', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('16', '16', '16', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `review` VALUES ('17', '17', '17', 'good', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for sale_history
-- ----------------------------
DROP TABLE IF EXISTS `sale_history`;
CREATE TABLE `sale_history` (
  `salehistory_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`salehistory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of sale_history
-- ----------------------------
INSERT INTO `sale_history` VALUES ('1', '1', '1', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('2', '2', '2', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('3', '3', '3', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('4', '4', '4', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('5', '5', '5', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('6', '6', '6', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('7', '7', '7', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('8', '8', '8', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('9', '9', '9', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('10', '10', '10', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('11', '11', '11', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('12', '12', '12', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('13', '13', '13', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('14', '14', '14', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('15', '15', '15', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('16', '16', '16', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');
INSERT INTO `sale_history` VALUES ('17', '17', '17', 'abc', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `store_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('1', '1', 'halu_summer', '20 Halu streets, LA', '2017-08-09 15:26:23', '2017-08-09 15:26:23');
INSERT INTO `store` VALUES ('2', '1', 'ball_nation', '126 Bali street, NY', '2017-08-09 15:31:23', '2017-08-09 15:31:23');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(11) NOT NULL,
  `gender` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tel_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123456', 'manh', 'user', 'male', 'manh@mail.com', '0949533285', '2017-08-09 15:30:27', '2017-08-09 15:30:27');
