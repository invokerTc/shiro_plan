package com.ruirui.user.dto;

/**
 * Created by Administrator on 2018/3/20.
 */
public class UserDTO {
    private String username;
    private String password;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
