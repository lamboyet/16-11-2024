package com.sebiprojects.springbootstart.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController  {

    @GetMapping
    public String getUser()
    {
        return "get user was called";
    }

    @PostMapping
    public String createUser()
    {
        return "create user was called";
    }

    @PutMapping
    public String updateUser()
    {
        return "update user was called";
    }

    @DeleteMapping
    public String deteleUser()
    {
        return "delete user was called";
    }
}
