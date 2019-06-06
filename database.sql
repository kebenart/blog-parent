
--创建数据库
--初始化blog博客数据
CREATE DATABASE blog;

USE blog;

CREATE TABLE `admin` (
  `id` varchar(32) NOT NULL,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Admin_PK` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `classify` (
  `c_id` varchar(32) NOT NULL,
  `c_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  UNIQUE KEY `Classify_PK` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `discuss` (
  `d_id` varchar(32) NOT NULL,
  `e_id` varchar(32) NOT NULL,
  `d_name` varchar(50) DEFAULT NULL,
  `d_content` varchar(500) DEFAULT NULL,
  `d_time` timestamp NULL DEFAULT NULL,
  `d_state` varchar(1) DEFAULT NULL,
  `d_level` decimal(10,0) DEFAULT NULL,
  `d_pId` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`d_id`),
  UNIQUE KEY `Discuss_PK` (`d_id`),
  KEY `FK_DISCUSS` (`d_pId`),
  KEY `essayDiscuss_FK` (`e_id`),
  CONSTRAINT `FK_DISCUSS` FOREIGN KEY (`d_pId`) REFERENCES `discuss` (`d_id`),
  CONSTRAINT `FK_DISCUSS_ESSAYDISC_ESSAY` FOREIGN KEY (`e_id`) REFERENCES `essay` (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `essay` (
  `e_id` varchar(32) NOT NULL,
  `c_id` varchar(32) NOT NULL,
  `e_title` varchar(200) DEFAULT NULL,
  `e_content` mediumtext,
  `e_state` varchar(32) DEFAULT NULL,
  `e_pageView` decimal(10,0) DEFAULT NULL,
  `e_goods` decimal(10,0) DEFAULT NULL,
  `e_promulgator` varchar(50) DEFAULT NULL,
  `e_createTime` timestamp NULL DEFAULT NULL,
  `e_settingTime` timestamp NULL DEFAULT NULL,
  `e_isSay` varchar(1) DEFAULT NULL,
  `e_photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`e_id`),
  UNIQUE KEY `Essay_PK` (`e_id`),
  KEY `essayClassify_FK` (`c_id`),
  CONSTRAINT `FK_ESSAY_ESSAYCLAS_CLASSIFY` FOREIGN KEY (`c_id`) REFERENCES `classify` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `label` (
  `l_id` varchar(32) NOT NULL,
  `l_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`l_id`),
  UNIQUE KEY `Lable_PK` (`l_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8



CREATE TABLE `good` (
  `good_id` varchar(32) NOT NULL,
  `good_name` varchar(20) DEFAULT NULL,
  `good_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `e_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`good_id`),
  KEY `good` (`e_id`),
  CONSTRAINT `good_ibfk_1` FOREIGN KEY (`e_id`) REFERENCES `essay` (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `essaylabel` (
  `l_id` varchar(32) NOT NULL,
  `e_id` varchar(32) NOT NULL,
  PRIMARY KEY (`l_id`,`e_id`),
  KEY `拥有_FK` (`l_id`),
  KEY `拥有2_FK` (`e_id`),
  CONSTRAINT `FK_ESSAYLAB_拥有2_ESSAY` FOREIGN KEY (`e_id`) REFERENCES `essay` (`e_id`),
  CONSTRAINT `FK_ESSAYLAB_拥有_LABLE` FOREIGN KEY (`l_id`) REFERENCES `label` (`l_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `page` (
  `p_id` varchar(32) NOT NULL,
  `p_name` varchar(50) DEFAULT NULL,
  `p_path` varchar(50) DEFAULT NULL,
  `p_createTime` timestamp NULL DEFAULT NULL,
  `p_state` varchar(1) DEFAULT NULL,
  `p_content` mediumtext,
  `p_isSay` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  UNIQUE KEY `page_PK` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8



CREATE TABLE `settings` (
  `s_id` varchar(32) NOT NULL,
  `s_name` varchar(20) DEFAULT NULL,
  `s_remark` varchar(200) DEFAULT NULL,
  `s_headImg` varchar(100) DEFAULT NULL,
  `s_bgImg` varchar(100) DEFAULT NULL,
  `s_title` varchar(100) DEFAULT NULL,
  `s_headRemark` varchar(200) DEFAULT NULL,
  `s_weibo` varchar(50) DEFAULT NULL,
  `s_weixin` varchar(50) DEFAULT NULL,
  `s_qq` varchar(50) DEFAULT NULL,
  `s_qqs` varchar(50) DEFAULT NULL,
  `s_zfbPay` varchar(100) DEFAULT NULL,
  `s_wxPay` varchar(100) DEFAULT NULL,
  `s_mywx` varchar(100) DEFAULT NULL,
  `s_headImgBg` varchar(100) DEFAULT NULL,
  `s_hmd` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `Settings_PK` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

INSERT INTO admin VALUE('0c0295bd011a4aaca9afd1295909f121','root','root','root');


INSERT INTO classify VALUE('12f619ab91984b1ea394cf42f70c0731','默认分类');

INSERT INTO settings(s_id) VALUE('25b0b83bc89d4912b54b968846ab26b3');



