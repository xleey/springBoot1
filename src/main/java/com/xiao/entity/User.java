package com.xiao.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "id不能为空")
    private long id;
    @NotEmpty(message = "姓名不能为空")
    @Length(min=2,message = "姓名长度不能小于2个字")
    private String name;
    @Min(value=16,message="年龄必须大于16")
    private int age;
}
