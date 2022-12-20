package com.tx.user.controller;


import com.tx.user.domain.User;
import com.tx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userServiceController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return "Hallo Spring Boot 3.0";
    }

    @PostMapping("/addUser")
    public Boolean addUser(@RequestBody User user){
        return userService.save(user);
    }

}
