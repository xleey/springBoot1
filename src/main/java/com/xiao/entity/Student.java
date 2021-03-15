package com.xiao.entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
