package com.acem.spring.demo.service;


import com.acem.spring.demo.model.Student;
import com.acem.spring.demo.response.Response;

public interface StudentService {

    Response getAll();

    Response getById(Long id);

    Response getByEmailAddress(String emailAddress);

    Response getByContactNo(String contactNo);

    Response save(Student student);

    Response update(Student student);

    Response delete(Long id);
}
