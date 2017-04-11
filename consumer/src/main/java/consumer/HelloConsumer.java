package consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import api.HelloService;

/**
 * Created by luchenhua on 11/04/2017.
 */
@Component
public class HelloConsumer {
    @Reference
    public HelloService helloService;
}
