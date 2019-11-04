package com.bitirmeproje.internproject.service;

import com.bitirmeproje.internproject.model.Users;
import com.bitirmeproje.internproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
}
