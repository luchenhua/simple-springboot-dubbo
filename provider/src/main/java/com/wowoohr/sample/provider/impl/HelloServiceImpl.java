package com.wowoohr.sample.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wowoohr.sample.api.HelloService;

/**
 * Created by luchenhua on 11/04/2017.
 */
@Service
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        System.out.println(name);
        return "Not hello world, " + name;
    }
}
