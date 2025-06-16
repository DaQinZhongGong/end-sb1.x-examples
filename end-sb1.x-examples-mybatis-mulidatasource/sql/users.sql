/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80027 (8.0.27)
 Source Host           : 1270.0.1:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 80027 (8.0.27)
 File Encoding         : 65001

 Date: 12/30/2015 20:05:05
*/

DROP DATABASE IF EXISTS `test1`;
CREATE DATABASE `test1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
USE `test1`;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`
(
    `id`        bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `userName`  varchar(32) DEFAULT NULL COMMENT '用户名',
    `passWord`  varchar(32) DEFAULT NULL COMMENT '密码',
    `user_sex`  varchar(32) DEFAULT NULL,
    `nick_name` varchar(32) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户表-测试用'
  ROW_FORMAT = COMPACT;


