package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseAttrInfo;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-01 22:34
 */
public interface BaseAttrInfoService {
    List<BaseAttrInfo> getAttrListByCal3(BaseAttrInfo baseAttrInfo);

    void saveAttr(BaseAttrInfo baseAttrInfo);
}
