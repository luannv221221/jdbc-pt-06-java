package com.ra.model.dao;

import com.ra.model.entity.Student;
import com.ra.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAOImpl implements StudentDAO{
    @Override
    public List<Student> getAll() {
        Connection connection = null;
        List<Student> students = new ArrayList<>();
        connection = ConnectionDB.openConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFullName(resultSet.getString("fullName"));
                student.setAge(resultSet.getInt("age"));
                student.setPhone(resultSet.getString("phone"));
                student.setSex(resultSet.getBoolean("sex"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return students;
    }

    @Override
    public Boolean create(Student student) {
        return null;
    }

    @Override
    public Boolean update(Student student) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Optional<Student> findById(Integer id) {
        return Optional.empty();
    }
}
