package com.atguigu.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseCatalog1;
import com.atguigu.gmall.bean.BaseCatalog2;
import com.atguigu.gmall.bean.BaseCatalog3;
import com.atguigu.gmall.service.CatalogService;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-01 20:09
 */
@Controller
public class CatalogController {
    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
       List<BaseCatalog1> catalog1s= catalogService.getCatalog1();
        return catalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2){
        List<BaseCatalog2> catalog1s= catalogService.getCatalog2(baseCatalog2);
        return catalog1s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3){
        List<BaseCatalog3> catalog1s= catalogService.getCatalog3(baseCatalog3);
        return catalog1s;
    }
}
