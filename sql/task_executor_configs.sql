/*
 Navicat Premium Data Transfer

 Source Server         : 虚拟机
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 192.168.52.150:3306
 Source Schema         : quartz

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 08/12/2018 11:07:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for task_executor_configs
-- ----------------------------
DROP TABLE IF EXISTS `task_executor_configs`;
CREATE TABLE `task_executor_configs`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cron` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表达式',
  `job_method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '定时执行的方法',
  `project` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目',
  `describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `lazy_load` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '延迟执行 1-延迟执行',
  `lazy_time` bigint(20) NULL DEFAULT NULL COMMENT '延迟时间，单位：ms',
  `execute_number` int(11) NULL DEFAULT NULL COMMENT '执行次数',
  `execute_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近一次执行时间',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
