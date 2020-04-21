package com.lumos.demo.mapper;

import com.lumos.demo.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersMapper {

    //@Insert("insert into users(id,name,age) values(#{id},#{name},#{age})")
    void  insertUser(Users users);
}
