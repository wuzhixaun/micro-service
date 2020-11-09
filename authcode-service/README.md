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

## 三、操作方式

### 3.1 获取 授权码
http://localhost:8080/oauth/authorize?client_id=clientapp&redirect_uri=http://localhost:9001/callback&response_type=code&scope=read_userinfo
响应回调地址： `http://localhost:9001/callback?code=rhXGqY`

### 3.2 通过授权码获取访问令牌
Post localhost:8080/oauth/token?code=3IVikN&grant_type=authorization_code&redirect_uri=http://localhost:9001/callback&scope=read_userinfo

Content-Type:application/x-www-form-urlencoded

```
{
    "access_token": "9e4dde90-1940-45c4-9bf7-c3353a400762",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "read_userinfo"
}
```

### 3.3 通过token访问Api

GET http://localhost:8080/api/userinfo -H "authorization: Bearer 36cded80-b6f5-43b7-bdfc-594788a24530"