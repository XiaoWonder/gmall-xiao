package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 潇
 * @create 2019-04-27 15:08
 */
public interface UserInfoMapper extends Mapper<UserInfo> {
    //List<UserInfo> selectAllUser();
    List<UserInfo> getAllUser();
}
