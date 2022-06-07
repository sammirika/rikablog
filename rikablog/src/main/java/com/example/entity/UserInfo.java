package com.example.entity;

import lombok.Data;

@Data
public class UserInfo {
    private String name;
    private int age;

    public UserInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
}
