-- 创建数据库和表结构（需与代码中的字段一致）
CREATE DATABASE IF NOT EXISTS score_management_system;
USE score_management_system;

CREATE TABLE student (
     `id` VARCHAR(50) PRIMARY KEY COMMENT '学号',
     `name` VARCHAR(255) NOT NULL COMMENT '姓名',
     `grade` VARCHAR(50) NOT NULL COMMENT '年级',
     `math` DOUBLE NOT NULL COMMENT '高数',
     `sport` DOUBLE NOT NULL COMMENT '体育',
     `english` DOUBLE NOT NULL COMMENT '英语',
     `java` DOUBLE NOT NULL COMMENT 'Java',
     `algorithm` DOUBLE NOT NULL COMMENT '算法',
     `polity` DOUBLE NOT NULL COMMENT '政治',
     `average` DOUBLE NOT NULL COMMENT '平均分',
     `score` DOUBLE NOT NULL COMMENT '总分',
     `frontend` DOUBLE NOT NULL COMMENT '前端'
);