package cc.wangweiye.providerservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello")
    public String hello(String name) throws InterruptedException {
        long sleepTime = new Random().nextInt(15) * 1000;
        System.out.println(String.format("睡眠时间：%s", sleepTime));
        Thread.sleep(sleepTime);

        return port + ": hello " + name;
    }
}
