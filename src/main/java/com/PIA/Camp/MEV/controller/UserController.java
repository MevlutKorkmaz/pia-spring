package com.PIA.Camp.MEV.controller;

import com.PIA.Camp.MEV.entity.User;
import com.PIA.Camp.MEV.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private  UserService userService;

    @PostMapping(value = "/saveUser")
    public User saveUser (@RequestBody User user){
        return userService.saveUser(user);
    }

//{name}/{lastName}/{country}
    @GetMapping(value= "/users")
    public List<User> getUsersByNameLastNameAndCountry(
            @RequestParam String name,
            @RequestParam String lastName,
            @RequestParam String country) {
        return userService.findAllByNameAndLastNameAndAddressCountry(name, lastName, country);
    }
}
