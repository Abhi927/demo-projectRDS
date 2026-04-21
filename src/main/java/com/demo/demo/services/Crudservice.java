package com.demo.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.dao.Crudjpa;
import com.demo.demo.entity.Student;

@Service
public class Crudservice {
@Autowired
private Crudjpa dao;
public void createStudent(Student student)
{
	dao.save(student);
}
public List<Student> getStudent()
{
	return dao.findAll();
}
}

