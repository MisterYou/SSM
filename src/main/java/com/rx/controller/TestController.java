package com.rx.controller;

import com.rx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by youjin on 2017/10/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/find")
    @ResponseBody
    public Map test(String id) {

        return service.findOne(id);
    }
}



