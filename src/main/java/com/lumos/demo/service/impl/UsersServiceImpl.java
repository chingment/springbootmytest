package com.lumos.demo.service.impl;

import com.lumos.demo.mapper.UsersMapper;
import com.lumos.demo.pojo.Users;
import com.lumos.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users user){
      this.usersMapper.insertUser(user);
    }
}
