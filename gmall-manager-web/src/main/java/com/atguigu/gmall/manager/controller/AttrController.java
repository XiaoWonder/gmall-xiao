package com.atguigu.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseAttrInfo;
import com.atguigu.gmall.service.BaseAttrInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-01 22:34
 */
@Controller
public class AttrController {
    @Reference
    BaseAttrInfoService baseAttrInfoService;

    @RequestMapping("getAttrListByCal3")
    @ResponseBody
    public List<BaseAttrInfo> getAttrListByCal3(BaseAttrInfo baseAttrInfo){
        List<BaseAttrInfo> baseAttrInfos=baseAttrInfoService.getAttrListByCal3(baseAttrInfo);
        return baseAttrInfos;
    }

    @RequestMapping("saveAttr")
    @ResponseBody
    public String saveAttr(BaseAttrInfo baseAttrInfo){

        baseAttrInfoService.saveAttr(baseAttrInfo);
        return "success";
    }


}
