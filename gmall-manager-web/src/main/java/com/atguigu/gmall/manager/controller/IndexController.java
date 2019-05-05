package com.atguigu.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 潇
 * @create 2019-05-01 9:32
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("attrListPage")
    public String getAttrListPage() {
        return "attrListPage";
    }

    @RequestMapping("spuListPage")
    public String spuListPage() {
        return "spuListPage";
    }
}
