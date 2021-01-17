package cc.wangweiye.providerservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) throws InterruptedException {
        Thread.sleep(60 * 1000);

        return "hello " + name;
    }
}
