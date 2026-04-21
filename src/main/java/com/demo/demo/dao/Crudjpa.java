package com.demo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.demo.demo.entity.Student;

public interface Crudjpa extends JpaRepository<Student,Long> {
	

}
