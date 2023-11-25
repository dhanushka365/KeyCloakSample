package com.example.Service;


import com.example.Entity.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;
    public User getUserByEmail(String username) {
        return (User) userRepository.findByEmail(username);
    }
}
