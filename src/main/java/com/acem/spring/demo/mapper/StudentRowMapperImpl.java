package com.acem.spring.demo.mapper;


import com.acem.spring.demo.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapperImpl implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getLong("ID"));
        student.setName(resultSet.getString("NAME"));
        student.setEmail(resultSet.getString("EMAIL"));
        student.setContactNo(resultSet.getString("CONTACT_NO"));
        return student;
    }
}
