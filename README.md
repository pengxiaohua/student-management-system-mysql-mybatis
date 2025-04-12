# Student Management System

[![Java Version](https://img.shields.io/badge/Java-8%2B-orange)](https://java.com)
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)

## 🚀 项目简介
基于Java实现的命令行学生成绩管理系统，使用MySQL作为数据库，MyBatis作为ORM框架。适合Java初学者练手的实战小项目。

## 🌲 项目结构
```markdown
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── sms/
│   │   │           ├── model/          # 实体类
│   │   │           │   └── Student.java
│   │   │           ├── dao/            # MyBatis Mapper 接口
│   │   │           │   └── StudentMapper.java
│   │   │           ├── service/        # 业务逻辑层
│   │   │           │   └── StudentService.java
│   │   │           └── App.java        # 主入口
│   │   └── resources/
│   │       ├── mybatis-config.xml      # MyBatis 核心配置
│   │       └── mapper/
│   │           └── StudentMapper.xml   # SQL 映射文件
├── sql/
│   └── schema.sql                      # 数据库初始化脚本
└── pom.xml                             # 核心配置文件
```

## 📋 核心功能
✅ 学生成绩CRUD操作（增删改查）

✅ 命令行交互界面

✅ MySQL数据持久化

✅ MyBatis ORM框架集成

## 🛠️ 技术栈
- **核心语言**: Java 8+
- **构建工具**: Maven
- **数据库**: MySQL 8.0+
- **ORM框架**: MyBatis 3.5+
- **依赖管理**: JDBC, MyBatis Generator

## ⚡ 快速开始

### 环境准备
1. JDK 17
2. MySQL 8.0+
3. Maven 3.6+
