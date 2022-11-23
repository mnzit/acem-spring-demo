package com.acem.spring.demo.service.impl;


import com.acem.spring.demo.builder.ResponseBuilder;
import com.acem.spring.demo.constant.ResponseMessageConstant;
import com.acem.spring.demo.dao.StudentDao;
import com.acem.spring.demo.model.Student;
import com.acem.spring.demo.response.Response;
import com.acem.spring.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Response getAll() {
        Optional<List<Student>> optionalStudentList = studentDao.getAll();
        Response responseBody = null;
        if (optionalStudentList.isPresent()) {
            List<Student> students = optionalStudentList.get();
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.ALL, students);
        } else {
            responseBody = ResponseBuilder.notFound(ResponseMessageConstant.Student.NOT_FOUND);
        }
        return responseBody;
    }

    @Override
    public Response getById(Long id) {
        Optional<Student> optionalStudent = studentDao.getById(id);
        Response responseBody = null;
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.ONE, student);

        } else {
            responseBody = ResponseBuilder.notFound(ResponseMessageConstant.Student.NOT_FOUND);
        }
        return responseBody;
    }

    @Override
    public Response getByEmailAddress(String emailAddress) {
        return null;
    }

    @Override
    public Response getByContactNo(String contactNo) {
        return null;
    }

    @Override
    public Response save(Student student) {
        Boolean isSaved = studentDao.save(student);
        Response responseBody = null;
        if (isSaved) {
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.SAVED);
        } else {
            responseBody = ResponseBuilder.failure(ResponseMessageConstant.Student.NOT_SAVED);
        }
        return responseBody;
    }

    @Override
    public Response update(Student student) {
        Boolean isUpdated = studentDao.update(student);
        Response responseBody = null;
        if (isUpdated) {
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.UPDATED);
        } else {
            responseBody = ResponseBuilder.failure(ResponseMessageConstant.Student.NOT_UPDATED);
        }
        return responseBody;
    }

    @Override
    public Response delete(Long id) {
        Boolean isDeleted = studentDao.delete(id);
        Response responseBody = null;
        if (isDeleted) {
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.DELETED);
        } else {
            responseBody = ResponseBuilder.failure(ResponseMessageConstant.Student.NOT_DELETED);
        }
        return responseBody;
    }
}
