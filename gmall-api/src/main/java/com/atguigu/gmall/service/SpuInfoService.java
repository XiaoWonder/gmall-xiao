package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuInfo;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-02 21:46
 */
public interface SpuInfoService {
    List<SpuInfo> getSpuInfoList(String catalog3Id);

    List<BaseSaleAttr> baseSaleAttrList();
}
