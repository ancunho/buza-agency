
# 관리자계정 테이블
CREATE TABLE `bt_admin_account` (
                                    `seq` bigint NOT NULL,
                                    `username` varchar(100) NOT NULL,
                                    `password` varchar(255) NOT NULL,
                                    `status` varchar(1) DEFAULT NULL,
                                    `real_name` varchar(45) DEFAULT NULL,
                                    `role_code` varchar(45) DEFAULT NULL,
                                    `role_name` varchar(45) DEFAULT NULL,
                                    `mobile_no` varchar(45) DEFAULT NULL,
                                    `email` varchar(100) DEFAULT NULL,
                                    `thumbnail_url` varchar(255) DEFAULT NULL,
                                    `wechat` varchar(45) DEFAULT NULL,
                                    `kakao` varchar(45) DEFAULT NULL,
                                    `memo` varchar(255) DEFAULT NULL,
                                    `created_at` datetime DEFAULT NULL,
                                    `created_by` varchar(45) DEFAULT NULL,
                                    `modified_at` datetime DEFAULT NULL,
                                    `modified_by` varchar(45) DEFAULT NULL,
                                    PRIMARY KEY (`seq`),
                                    UNIQUE KEY `seq_UNIQUE` (`seq`),
                                    UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='관리자계정테이블';

# 회원 계정 테이블
CREATE TABLE `bt_account` (
                              `seq` bigint NOT NULL AUTO_INCREMENT COMMENT 'aaaaa',
                              `username` varchar(32) NOT NULL,
                              `password` varchar(100) DEFAULT NULL,
                              `status` varchar(10) DEFAULT '1',
                              `level` varchar(10) DEFAULT '1',
                              `role` varchar(20) DEFAULT NULL,
                              `type` varchar(10) DEFAULT NULL,
                              `email` varchar(100) DEFAULT NULL,
                              `mobile_no` varchar(45) DEFAULT NULL,
                              `wechat_id` varchar(45) DEFAULT NULL,
                              `kakao_id` varchar(45) DEFAULT NULL,
                              `avatar` varchar(255) DEFAULT NULL,
                              `birthday` varchar(50) DEFAULT NULL,
                              `gender` varchar(1) DEFAULT '0',
                              `nick_name` varchar(50) DEFAULT NULL,
                              `real_name` varchar(50) DEFAULT NULL,
                              `intro` varchar(45) DEFAULT NULL,
                              `country` varchar(45) DEFAULT NULL,
                              `city` varchar(45) DEFAULT NULL,
                              `district` varchar(45) DEFAULT NULL,
                              `address` varchar(255) DEFAULT NULL,
                              `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
                              `created_by` varchar(50) DEFAULT 'buza',
                              `modified_at` datetime(6) DEFAULT NULL,
                              `modified_by` varchar(50) DEFAULT NULL,
                              PRIMARY KEY (`seq`),
                              UNIQUE KEY `UK8casvsmuwgk4wg29hs7659l03` (`username`),
                              KEY `IDXeqhpq2whgaskkfyipueac7hi0` (`created_at`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Account - 회원테이블';


# 포스트 테이블
CREATE TABLE `bt_post` (
                           `post_seq` bigint NOT NULL AUTO_INCREMENT,
                           `post_uuid` varchar(45) DEFAULT NULL,
                           `post_type` varchar(10) NOT NULL,
                           `post_title` varchar(100) DEFAULT NULL,
                           `post_intro` varchar(255) DEFAULT NULL,
                           `post_content` mediumtext,
                           `event_start_time` varchar(45) DEFAULT NULL,
                           `event_end_time` varchar(45) DEFAULT NULL,
                           `reserve_start_time` varchar(45) DEFAULT NULL,
                           `reserve_end_time` varchar(45) DEFAULT NULL,
                           `post_thumbnail_small` varchar(100) DEFAULT NULL,
                           `post_thumbnail_big` varchar(100) DEFAULT NULL,
                           `post_banner_bg` varchar(100) DEFAULT NULL,
                           `post_author` varchar(45) DEFAULT NULL,
                           `is_join` varchar(10) DEFAULT NULL COMMENT '참여여부(0:불필요, 1: 필요), 회원이 참여하는 포스트 , 예: 레슨',
                           `is_need_pay` varchar(10) DEFAULT NULL COMMENT '지불이 필요한 포스트인가?',
                           `post_price` decimal(20,2) DEFAULT NULL,
                           `status` varchar(10) DEFAULT NULL,
                           `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
                           `created_by` varchar(50) DEFAULT 'buza',
                           `modified_at` datetime(6) DEFAULT NULL,
                           `modified_by` varchar(50) DEFAULT NULL,
                           PRIMARY KEY (`post_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Post - 블로그 포스트 테이블';
