package provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import provider.HelloService;

/**
 * Created by luchenhua on 11/04/2017.
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Not hello world, " + name;
    }
}
