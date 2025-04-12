package com.sms;

import com.sms.model.Student;
import com.sms.service.StudentService;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("————————————欢迎使用学生成绩管理系统————————————");
            System.out.println("————————————【1】录入学生成绩————————————");
            System.out.println("————————————【2】查询学生成绩————————————");
            System.out.println("————————————【3】修改学生成绩————————————");
            System.out.println("————————————【4】删除学生成绩————————————");
            System.out.println("————————————【5】查询所有成绩————————————");
            System.out.println("————————————【0】退出管理系统————————————");

            //  Student student = new Student();
            StudentService studentService = new StudentService();

            System.out.println("请输入你的选择【0-5】");

            String choice = scanner.next();
            switch (choice) {
                case "1":
                    // 录入学生成绩
                    studentService.insertScore();
                    break;
                case "2":
                    // 查找对应学生成绩
                    studentService.queryStudentById();
                    break;
                case "3":
                    // 修改学生成绩
                    studentService.updateScoreById();
                    break;
                case "4":
                    // 删除学生成绩
                    studentService.deleteStudentById();
                    break;
                case "5":
                    // 查询所有学生成绩
                    studentService.queryScores();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
