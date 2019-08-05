package com.spring.boot.controller;

import com.spring.boot.entity.BatchUploadTable;
import com.spring.boot.repository.BatchUploadTableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dpgupta on 10/12/2018.
 */
@RestController
@RequestMapping("/user")
//@ComponentScan({"com.spring.boot.entity","com.spring.boot.repository"})
@EntityScan("com.spring.boot.entity")
@EnableJpaRepositories("com.spring.boot.repository")
public class UserController {

    @Autowired
    BatchUploadTableRepository userRepository;

    @GetMapping("/get")
    public List<BatchUploadTable> getUsers(){ //hit url to execute this method -> localhost:8083/user/get
        System.out.println("@@@@@@@@@@@@@ Fetching all user details ");
        return userRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public BatchUploadTable getUser(@PathVariable Integer id){
        return userRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable Integer id){
        System.out.println("@@@@@@@@@@@@@ deleting the user details :");
        userRepository.deleteById(id);
        return true;
    }

    @PostMapping("/insert")
    public BatchUploadTable createUser(@RequestBody BatchUploadTable user){
        System.out.println("@@@@@@@@@@@@@ creating the user details :");
        return userRepository.save(user);
    }

    @PutMapping("/update")
    public BatchUploadTable updateUser(@RequestBody BatchUploadTable user){
        System.out.println("@@@@@@@@@@@@@ update the user details :" + user);
        userRepository.save(user);
        return user;
    }
}
