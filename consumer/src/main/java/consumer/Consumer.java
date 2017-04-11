package consumer;

import api.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by luchenhua on 05/04/2017.
 */
@SpringBootApplication
public class Consumer {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloConsumer.class, args);
        HelloService bean = run.getBean(HelloService.class);
        System.out.println(bean.hello("abccc"));
    }
}
