package com.xiao.repository.impl;
import com.xiao.entity.Student;
import com.xiao.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> studentMap;
    static{
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",21));
        studentMap.put(2L,new Student(2L,"张四",22));
        studentMap.put(1L,new Student(3L,"张五",23));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
