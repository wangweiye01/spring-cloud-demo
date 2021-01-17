package cc.wangweiye.providerservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello")
    public String hello(String name) throws InterruptedException {
        //Thread.sleep(60 * 1000);

        return port + ": hello " + name;
    }
}
