package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 潇
 * @create 2019-04-27 14:59
 */
@RestController
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("userList")
    public List<UserInfo> userList(){
        List<UserInfo>  userList= userService.userList();
        return userList;
    }

    @RequestMapping("getAddressListByUser")
    public ResponseEntity<List<UserAddress>> getAddressListByUser(String userId){
        List<UserAddress> userAddressList = userService.getAddressListByUser(userId);

        return ResponseEntity.ok(userAddressList);
    }
}
