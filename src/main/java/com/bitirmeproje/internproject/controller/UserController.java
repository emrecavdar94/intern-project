package com.bitirmeproje.internproject.controller;

import com.bitirmeproje.internproject.model.Users;
import com.bitirmeproje.internproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity getUserList(){
        List<Users> users=userService.getAllUsers();
        return new ResponseEntity(users,HttpStatus.OK);
    }
}
