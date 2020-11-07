## 一、添加依赖
``` java
        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework.security.oauth/spring-security-oauth2 -->
        <dependency>
            <groupId>org.springframework.security.oauth</groupId>
            <artifactId>spring-security-oauth2</artifactId>
            <version>2.3.5.RELEASE</version>
        </dependency>
```

## 二、启动权限配置

``` java

 在启动类中添加@EnableAuthorizationServer注解：

@EnableAuthorizationServer // 开启权限配置
@SpringBootApplication
public class AuthcodeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthcodeServiceApplication.class, args);
    }

}

```

## 三、编写 AuthorizationServerConfigurerAdapter


