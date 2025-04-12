package com.sms.service;

import com.sms.dao.StudentMapper;
import com.sms.model.Student;
import com.sms.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private final StudentMapper studentMapper;
    private final Scanner scanner = new Scanner(System.in);

    public StudentService() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        this.studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    public boolean isValid (String id) {
        // 调用 Mapper 接口查询学号是否存在
        Student existingStudent = studentMapper.queryStudentById(id);
        return existingStudent != null; // 存在返回 true，否则 false
    }

    public void insertScore() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        Student student = new Student();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------录入学生成绩--------");
        System.out.println("请依次录入以下数据：");

        String id;
        while (true) {
            System.out.println("学号");
            id = scanner.nextLine();
            // isValid 判断学号是否已经存在
            if (isValid(id)) {
                System.out.println("学号重复，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("年级");
        String grade = scanner.nextLine();

        System.out.println("姓名");
        String name = scanner.nextLine();

        System.out.println("数学");
        Double math = scanner.nextDouble();

        System.out.println("英语");
        Double english = scanner.nextDouble();

        System.out.println("体育");
        Double sport = scanner.nextDouble();

        System.out.println("Java");
        Double java = scanner.nextDouble();

        System.out.println("前端");
        Double frontend = scanner.nextDouble();

        System.out.println("政治");
        Double polity = scanner.nextDouble();

        System.out.println("算法");
        Double algorithm = scanner.nextDouble();

        student.setId(id);
        student.setName(name);
        student.setGrade(grade);
        student.setMath(math);
        student.setEnglish(english);
        student.setSport(sport);
        student.setJava(java);
        student.setFrontend(frontend);
        student.setPolity(polity);
        student.setAlgorithm(algorithm);
        student.setScore(math + english + sport + java + frontend + polity + algorithm);
        student.setAverage(student.getScore() * 1.0 / 7);

        int i = mapper.insertScore(student);
        if (i > 0) {
            sqlSession.commit();
            System.out.println("录入成绩成功！");
        } else {
            System.out.println("录入成绩失败，请重新录入！");
        }

        sqlSession.close();
    }

    public void queryStudentById() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------查找学生成绩---------");
        List<Student> students = mapper.showStudentList();
        Student result = new Student();

        Boolean flag = false;
        if (students.size() == 0) {
            System.out.println("当前无数据，请录入成绩后再试！");
        } else {
            System.out.println("请输入要查找成绩学生的学号");
            String id = scanner.nextLine();
            for (Student student : students) {
                if (id.equals(student.getId())) {
                    flag = true;
                    result = student;
                }
            }
            if (flag) {
                System.out.println("对应学号的学生成绩如下：");
                System.out.println("学号\t班级\t姓名\t数学\t\t英语\t\t体育\t\tJava\t前端\t\t政治\t\t算法\t\t平均分\t总分");
                System.out.format("%s\t%s\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", result.getId(), result.getGrade(), result.getName(), result.getMath(), result.getEnglish(), result.getSport(), result.getJava(), result.getFrontend(), result.getPolity(), result.getAlgorithm(), result.getAverage(), result.getScore());
                System.out.println("查找成绩成功！");
            } else {
                System.out.println("未找到对应学号的学生，请确认后再重新输入");
            }
        }
        sqlSession.close();
    }

    public void updateScoreById () {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        List<Student> students = mapper.showStudentList();
        System.out.println("---------修改学生成绩---------");
        if (students.isEmpty()) {
            System.out.println("当前数据库无数据，请添加后重试");
        } else {
            System.out.println("请输入要修改学生的学号");
            String id = scanner.nextLine();
            Student student = new Student();

            if (student == null) {
                System.out.println("未找到对应学号学生信息，请确认后再更新！");
            } else {
                System.out.println("请重新输入该学生的成绩");
                System.out.println("数学");
                Double math = scanner.nextDouble();
                System.out.println("英语");
                Double english = scanner.nextDouble();
                System.out.println("体育");
                Double sport = scanner.nextDouble();
                System.out.println("Java");
                Double java = scanner.nextDouble();
                System.out.println("前端");
                Double frontend = scanner.nextDouble();
                System.out.println("政治");
                Double polity = scanner.nextDouble();
                System.out.println("算法");
                Double algorithm = scanner.nextDouble();

                if (mapper.updateScoreById(student) > 0) {
                    sqlSession.commit();
                    System.out.println("---------更新成功---------");
                }  else {
                    System.out.println("---------更新失败---------");
                }
            }
        }
        sqlSession.close();
    }

    public void
}
