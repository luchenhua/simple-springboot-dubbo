package provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import api.HelloService;

/**
 * Created by luchenhua on 11/04/2017.
 */
@Service
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Not hello world, " + name;
    }
}
