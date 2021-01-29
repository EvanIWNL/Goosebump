package com.techsuc.exam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.techsuc.exam.entity.User;
import org.springframework.stereotype.Repository;

//java泛型 接口
@Repository
public interface UserMapper extends BaseMapper<User> {
}
