package com.wuzx.oauth2.authcodeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer // 开启权限配置
@SpringBootApplication
public class AuthcodeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthcodeServiceApplication.class, args);
    }

}
