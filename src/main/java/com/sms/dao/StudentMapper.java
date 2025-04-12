package com.sms.dao;

import com.sms.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 录入学生成绩
     * @param student
     * @return
     */
    int insertScore(Student student);

    /**
     * 查看所有学生成绩
     * @param
     * @return List<Student> 学生列表
     */
    public List<Student> showStudentList();

    /**
     * 通过学号查学生成绩
     * @param id
     * @return
     */
    public Student queryStudentById(String id);

    /**
     * 修改对应学号学生的成绩
     * @param student
     * @return
     */
    public int updateScoreById(Student student);


    /**
     * 删除对应学号学生的成绩
     * @param id
     * @return
     */
    public int deleteStudentById(String id);
}