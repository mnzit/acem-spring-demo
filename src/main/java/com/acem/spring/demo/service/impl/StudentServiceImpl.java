package com.acem.spring.demo.service.impl;


import com.acem.spring.demo.builder.ResponseBuilder;
import com.acem.spring.demo.constant.ResponseMessageConstant;
import com.acem.spring.demo.model.Student;
import com.acem.spring.demo.repository.StudentRepository;
import com.acem.spring.demo.response.Response;
import com.acem.spring.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Response getAll() {
        List<Student> students = studentRepository.findAll();
        Response responseBody = null;
        if (!students.isEmpty()) {
            responseBody = ResponseBuilder.success(ResponseMessageConstant.Student.ALL, students);
        } else {
            responseBody = ResponseBuilder.notFound(ResponseMessageConstant.Student.NOT_FOUND);
        }
        return responseBody;
    }

    @Override
    public Response getById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
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
        Optional<Student> optionalStudent = studentRepository.findByEmail(emailAddress);
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
    public Response getByContactNo(String contactNo) {
        return null;
    }

    @Override
    public Response save(Student student) {
        return null;
    }

    @Override
    public Response update(Student student) {
        return null;
    }

    @Override
    public Response delete(Long id) {
        return null;
    }
}
