package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 潇
 * @create 2019-04-27 15:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> allUser = userInfoMapper.getAllUser();
        return allUser;
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void updateUser(String id, UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> getAddressListByUser(String userId) {

        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> select = userAddressMapper.select(userAddress);
        return select;
    }


    @Override
    public List<UserInfo> userList() {

        return userInfoMapper.selectAll();
    }

    @Override
    public UserAddress getUserAddressByAddressId(String deliveryAddress) {
        UserAddress userAddress = new UserAddress();
        userAddress.setId(deliveryAddress);
        return userAddressMapper.selectOne(userAddress);
    }
}
