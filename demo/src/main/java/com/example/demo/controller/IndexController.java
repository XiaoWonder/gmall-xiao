package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 潇
 * @create 2019-04-27 14:36
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
