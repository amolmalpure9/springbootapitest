package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/getData")
    public Student getData(){
        Student s = new Student();
        s.setId("1");
        s.setName("Amol");
        return s;
    }

    @PutMapping("/putData")
    public String putData(@RequestBody String str){
        return "PUT Sucess";
    }

    @PostMapping("/saveData")
    public ResponseEntity<String> saveData(@RequestBody ArrayList<Student> studentList){
        //code to save the data
        return ResponseEntity.ok("Sucess");
    }

    @DeleteMapping("/deleteData")
    public ResponseEntity<String> deletData(@RequestBody Student student){
        //code to dalete the data
        return ResponseEntity.ok("Sucess");
    }

    public void add(int a , int n){

    }
}
