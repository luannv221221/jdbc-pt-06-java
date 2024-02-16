package com.ra.model.dao;

import com.ra.model.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    List<Student> getAll();
    Boolean create(Student student);
    Boolean update(Student student);
    void delete(Integer id);
    Optional<Student> findById(Integer id);
}
