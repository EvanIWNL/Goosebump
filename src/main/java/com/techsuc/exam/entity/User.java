package com.techsuc.exam.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Date;

@Data
public class User {

    //AUTO:自动增长
    //ID_WORKER:mp自带，生成19位值，数字类型使用
    //ID_WORKER_STR:mp自带，生成19位值，字符串类型使用
    //会默认识别
    //INPUT:自己输入
    //NONE:无策略
    //UUID:随机生成唯一值
    //@TableId(type= IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill= FieldFill.INSERT)
    private Date createTime;
    @TableField(fill=FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
