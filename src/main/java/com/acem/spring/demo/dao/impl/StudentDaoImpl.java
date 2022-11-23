package com.acem.spring.demo.dao.impl;

import com.acem.spring.demo.constant.DbQueryConstant;
import com.acem.spring.demo.dao.StudentDao;
import com.acem.spring.demo.mapper.StudentRowMapperImpl;
import com.acem.spring.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<List<Student>> getAll() {
        List<Student> students = jdbcTemplate
                .query(DbQueryConstant.Student.GET_ALL, new StudentRowMapperImpl());
        return students.isEmpty() ? Optional.empty() : Optional.of(students);
    }

    @Override
    public Optional<Student> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> getByEmailAddress(String emailAddress) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> getByContactNo(String contactNo) {
        return Optional.empty();
    }

    @Override
    public Boolean save(Student student) {
        return null;
    }

    @Override
    public Boolean update(Student student) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
