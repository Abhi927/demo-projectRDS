package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entity.Student;
import com.demo.demo.services.Crudservice;

@RestController
@RequestMapping("/api/student")
public class Crudclass {
@Autowired
 private Crudservice service;
    @PostMapping
    public ResponseEntity<Void> createSkill(@RequestBody Student student) {
        service.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAllSkills() {
        return ResponseEntity.ok(service.getStudent());
    }
}
