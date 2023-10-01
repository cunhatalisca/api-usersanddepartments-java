package com.devsuperior.UserDept.controllers;

import com.devsuperior.UserDept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.devsuperior.UserDept.entities.User;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired // injeção de dependências
    private UserRepository repository;

    @GetMapping
    public List<User> findAllUsers() {
        List<User> allUsersResult = repository.findAll();
        return allUsersResult;
    }

    @GetMapping(value = "/{id}")
    public User findAUserById(@PathVariable Long id) {
        User resultOfAUser = repository.findById(id).get();
        return resultOfAUser;
    }

    @PostMapping
    public User insertUser(@RequestBody User user) {
        User saveUser = repository.save(user);
        return saveUser;
    }

}
