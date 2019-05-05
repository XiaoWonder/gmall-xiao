package com.atguigu.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.BaseAttrInfo;
import com.atguigu.gmall.bean.BaseAttrValue;
import com.atguigu.gmall.manager.mapper.BaseAttrInfoMapper;
import com.atguigu.gmall.manager.mapper.BaseAttrValueMapper;
import com.atguigu.gmall.service.BaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-01 22:37
 */
@Service
public class BaseAttrInfoServiceImpl implements BaseAttrInfoService {
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;
    @Override
    public List<BaseAttrInfo> getAttrListByCal3(BaseAttrInfo baseAttrInfo) {
        BaseAttrInfo attrInfo=new BaseAttrInfo();
        attrInfo.setCatalog3Id(baseAttrInfo.getCatalog3Id());
        return baseAttrInfoMapper.select(attrInfo);
    }

    @Override
    public void saveAttr(BaseAttrInfo baseAttrInfo) {
        //插入属性表数据,生成主键
        baseAttrInfoMapper.insertSelective(baseAttrInfo);
        //根据属性主键批量插入属性值表
        List<BaseAttrValue> attrValueList = baseAttrInfo.getAttrValueList();
        for (BaseAttrValue baseAttrValue : attrValueList) {
            baseAttrValue.setAttrId(baseAttrInfo.getId());
            baseAttrValueMapper.insert(baseAttrValue);
        }

    }
}
