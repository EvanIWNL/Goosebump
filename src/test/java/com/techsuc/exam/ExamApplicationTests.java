package com.techsuc.exam;

import com.techsuc.exam.entity.User;
import com.techsuc.exam.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ExamApplicationTests {

    @Autowired//注入
    private UserMapper userMapper;

    //查询User表中所有数据
    @Test
    public void findAll() {
        List<User> users=userMapper.selectList(null);
        System.out.println(users);
    }

    //添加操作
    @Test
    public void addUser(){
        //ID不是自动增长 主键 MP自动生成 19位
        //主键策略
        //自动增长 AUTO INCREMENT 需关注上张表数据
        //UUID 每次生成随机的唯一值 排序不方便
        //redis 原子操作 INCR INCRBY
        //Twitter的snowflake算法 mp自带策略
        User user=new User();
        user.setName("Mary");
        user.setAge(16);
        user.setEmail("5@qq.com");
        int insert=userMapper.insert(user);
        System.out.println("insert:"+insert);
    }

    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2L);
        user.setAge(110);
        int row=userMapper.updateById(user);
        System.out.println(row);
    }

}
