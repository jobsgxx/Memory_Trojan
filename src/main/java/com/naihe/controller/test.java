package com.naihe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class test {
    @RequestMapping(value = "/test", produces = {"application/json; charset=UTF-8"}, method = RequestMethod.GET)
    @ResponseBody
    public String hello(String name, Model model){
        model.addAttribute("msg",name);
        return "This is test page";
    }
}