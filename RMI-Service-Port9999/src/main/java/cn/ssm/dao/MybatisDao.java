package cn.ssm.dao;

import cn.ssm.entity.Student;

import java.util.List;

public interface MybatisDao {
    void add(Student student);
    void delete(Student student);
    void update(Student student);
    List<Student> findAll();
    Student findById(String id);
    Student findByStudent(Student student);
    Integer findByStates(String str);
    Integer findByType(String str);
}