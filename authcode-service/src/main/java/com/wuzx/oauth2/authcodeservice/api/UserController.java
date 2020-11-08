package com.wuzx.oauth2.authcodeservice.api;

import com.wuzx.oauth2.authcodeservice.model.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


    @GetMapping("/api/userinfo")
    public ResponseEntity<UserInfo> getUserInfo() {
        User user = (User) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        UserInfo userInfo = new UserInfo();
        userInfo.setName(user.getUsername());

        String email = user.getUsername() + "@spring2go.com";
        userInfo.setEmail(email);

        return ResponseEntity.ok(userInfo);
    }
}
