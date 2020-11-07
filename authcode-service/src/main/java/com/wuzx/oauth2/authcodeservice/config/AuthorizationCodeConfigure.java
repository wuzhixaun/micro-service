package com.wuzx.oauth2.authcodeservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * @author by wuzhixuan
 * @Classname AuthorizationCodeConfigure
 * @Description TODO
 * @Date 2020/11/7 3:24 下午
 */
@Configuration
public class AuthorizationCodeConfigure extends AuthorizationServerConfigurerAdapter {


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()                                   // 使用in-memory存储
                .withClient("client_id")             // client_id
                .secret("secret")                            // 密码
                .authorizedGrantTypes("authorization_code")  // 该client允许的授权类型
                .scopes("app");                              // 允许的授权范围
    }
}
