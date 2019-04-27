package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 潇
 * @create 2019-04-27 14:59
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userList")
    public List<UserInfo> userList(){
        List<UserInfo>  userList= userService.userList();
        return userList;
    }
}
