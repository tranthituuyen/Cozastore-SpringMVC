/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 100417
 Source Host           : localhost:3306
 Source Schema         : ministore

 Target Server Type    : MySQL
 Target Server Version : 100417
 File Encoding         : 65001

 Date: 12/03/2021 18:17:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categoryModel
-- ----------------------------
DROP TABLE IF EXISTS `categoryModel`;
CREATE TABLE `categoryModel`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `created_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `modified_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `category_id`(`code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categoryModel
-- ----------------------------
INSERT INTO `categoryModel` VALUES (1, 'ao-khoac', 'Áo khoác', '2021-03-06 19:57:28', 'tú uyên', NULL, NULL);
INSERT INTO `categoryModel` VALUES (2, 'ao-thun', 'Áo thun', '2021-03-06 19:58:47', 'tú uyên', NULL, NULL);
INSERT INTO `categoryModel` VALUES (3, 'so-mi', 'Sơ mi', '2021-03-06 19:58:47', 'tú uyên', NULL, NULL);

-- ----------------------------
-- Table structure for productModel
-- ----------------------------
DROP TABLE IF EXISTS `productModel`;
CREATE TABLE `productModel`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int NOT NULL,
  `cover` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `details` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `status` bit(1) NULL DEFAULT b'1',
  `created_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `modified_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_fk_category_code`(`category_code`) USING BTREE,
  INDEX `code`(`code`) USING BTREE,
  CONSTRAINT `product_fk_category_code` FOREIGN KEY (`category_code`) REFERENCES `categoryModel` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productModel
-- ----------------------------
INSERT INTO `productModel` VALUES (1, 'collar-shirt', 'Áo Sơ Mi Nam SSSTUTTER Collar Shirt', 'so-mi', 419000, 'CollarShirt_cover.jpg', 'nam', '<p>Chất liệu: Vải Bamboo kh&ocirc;ng g&acirc;y hại đến m&ocirc;i trường. Chống nhăn, thấm h&uacute;t vượt trội hơn chất liệu cotton th&ocirc;ng thường đến 60%.</p>\n\n<p>Kiểu d&aacute;ng: Loại sơ mi cổ đức đơn giản nhưng kh&ocirc;ng bao giờ sợ bị lỗi mốt.</p>\n\n<p>M&agrave;u sắc: Hai m&agrave;u Đen/Trắng - tone m&agrave;u ph&ugrave; hợp với mọi tone da. Ứng dụng đa dạng cho mọi phong c&aacute;ch, mọi ho&agrave;n cảnh.</p>\n', '', b'1', '2021-01-08 13:09:46', 'Tú Uyên', NULL, NULL);
INSERT INTO `productModel` VALUES (2, 'man-shirt', 'Áo Sơ Mi Nam SSSTUTTER Man Shirt', 'so-mi', 419000, 'man-shirt-cover', 'nam', NULL, NULL, b'1', '2021-03-11 11:49:00', 'tú uyên', NULL, NULL);
INSERT INTO `productModel` VALUES (4, 'thomas-jacket', 'Áo Khoác Nam SSSTUTTER SSS. Thomas Jacket', 'ao-khoac', 799000, 'thomas-jacket-cover', 'nam', NULL, NULL, b'1', '2021-03-11 11:50:47', 'tú uyên', NULL, NULL);
INSERT INTO `productModel` VALUES (5, 'win-coat', 'Áo Khoác Dài Măng Tô Nam SSSTUTTER Win Coat 2020', 'ao-khoac', 999000, 'win-coat-cover', 'nam', NULL, NULL, b'1', '2021-03-11 11:51:48', 'tú uyên', NULL, NULL);
INSERT INTO `productModel` VALUES (6, 'dayday-long-tee', 'Áo Thun Unisex Dài Tay SSSTUTTER Dayday Long Tee', 'ao-thun', 199000, 'win-coat-cover', 'nam', NULL, NULL, b'1', '2021-03-11 11:53:26', 'tú uyên', NULL, NULL);

-- ----------------------------
-- Table structure for product_detail
-- ----------------------------
DROP TABLE IF EXISTS `product_detail`;
CREATE TABLE `product_detail`  (
  `id` int NOT NULL,
  `product_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `size` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `color` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` bit(1) NULL DEFAULT b'1',
  `created_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `modified_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_detail_fk_product_code`(`product_code`) USING BTREE,
  CONSTRAINT `product_detail_fk_product_code` FOREIGN KEY (`product_code`) REFERENCES `productModel` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_detail
-- ----------------------------

-- ----------------------------
-- Table structure for product_image
-- ----------------------------
DROP TABLE IF EXISTS `product_image`;
CREATE TABLE `product_image`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `image_fk_product_code`(`product_code`) USING BTREE,
  CONSTRAINT `image_fk_product_code` FOREIGN KEY (`product_code`) REFERENCES `productModel` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_image
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `created_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `modified_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `code`(`code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'admin', 'admin', '2021-03-06 20:02:19', 'tú uyên', NULL, NULL);
INSERT INTO `role` VALUES (2, 'user', 'user', '2021-03-06 20:03:36', 'tú uyên', NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dob` timestamp NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` bit(1) NULL DEFAULT b'1',
  `role_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `created_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `modified_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_fk_role_code`(`role_code`) USING BTREE,
  CONSTRAINT `user_fk_role_code` FOREIGN KEY (`role_code`) REFERENCES `role` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
