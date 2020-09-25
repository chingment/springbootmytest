package com.lumos.demo.controller;

import com.lumos.demo.pojo.Users;
import com.lumos.demo.service.OrderService;
import com.lumos.demo.service.UsersService;
import com.lumos.demo.utils.CustomResult;
import com.lumos.demo.utils.CustomResultUtil;
import com.oracle.tools.packager.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.temporal.ChronoUnit;

@RestController
public class TestController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public CustomResult hello() {

        int a=1/0;
        try {
            Users user = new Users();
            user.setId(2);
            user.setName("chingment222");
            user.setAge(32);
            usersService.addUser(user);
        }
        catch (Exception ex){

            String s=ex.getMessage();
            System.out.printf("dsdd");
        }

        String s="333ddd3gggg";
        String b="dsda3333";

        return CustomResultUtil.success();
    }


    @RequestMapping("/createWrongOrder/{sid}")
    @ResponseBody
    public String createWrongOrder(@PathVariable int sid) {
        Log.info("购买物品编号sid=[{"+sid+"}]");


        orderService.createWrongOrder(sid);

        int id=0;
        return String.valueOf(id);
    }
}
