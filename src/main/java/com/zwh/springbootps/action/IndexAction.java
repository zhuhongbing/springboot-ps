package com.zwh.springbootps.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {
    @RequestMapping("/")
    public String IndexPage(){
        return "index";
    }



}
