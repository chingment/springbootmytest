package com.lumos.demo.controller;

import com.lumos.demo.pojo.Users;
import com.lumos.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello() {

        try {
            Users user = new Users();
            user.setId(2);
            user.setName("chingment222");
            user.setName("chingment21");
            user.setAge(32);
            usersService.addUser(user);
        }
        catch (Exception ex){

            String s=ex.getMessage();
            System.console().printf("dsdd");
        }

        String s="333ddd3gggg";
        String b="dsda3333";
        return s;
    }
}
