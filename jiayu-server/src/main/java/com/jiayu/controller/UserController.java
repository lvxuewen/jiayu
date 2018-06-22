package com.jiayu.controller;

import com.jiayu.bean.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by ThinkPad on 2018/6/18.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public String getUser(){
        return "hello";
    }

    @RequestMapping(value = "/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        return "success";
    }
}
