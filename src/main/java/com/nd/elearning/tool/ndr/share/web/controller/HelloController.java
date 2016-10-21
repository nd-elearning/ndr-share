package com.nd.elearning.tool.ndr.share.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by way on 2016/10/17.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/view")
    public String helloView(){
        return "/view";
    }

    @RequestMapping("/html/view")
    public String helloHtmlView(){
        return "/html/view";
    }
}
