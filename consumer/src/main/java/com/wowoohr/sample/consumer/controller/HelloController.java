package com.wowoohr.sample.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wowoohr.sample.api.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luchenhua on 11/04/2017.
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/greeting")
    public String index(@RequestParam(value = "name", defaultValue = "Nobody") String name) {
        return helloService.hello(name);
    }
}
