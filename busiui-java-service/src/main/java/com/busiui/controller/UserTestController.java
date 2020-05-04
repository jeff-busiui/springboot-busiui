package com.busiui.controller;

import com.busiui.domain.UserInfoDo;
import com.busiui.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:19
 */
@RestController
public class UserTestController {

    @Autowired
    UserTestService userTestService;

    @PostMapping("/busiui/insertUserInfo")
    public int insertUserInfo(@RequestBody UserInfoDo userInfoDo) {
        return userTestService.insertUserInfo(userInfoDo);
    }


    @GetMapping("/busiui/getUser/{id}")
    public UserInfoDo findUserInfoById(@PathVariable("id") Long id){
        return userTestService.findUserInfoById(id);
    }
}
