package com.wuzx.oauth2.authcodeservice.model;


public class UserInfo {

    private String name;            // 姓名
    private String email;           // 邮箱

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
