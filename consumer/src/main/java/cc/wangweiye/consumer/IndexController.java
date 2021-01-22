package cc.wangweiye.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Qualifier("cc.wangweiye.consumer.HelloFeignService")
    @Autowired
    private HelloFeignService feignService;

    @Value("${a}")
    private String aValue;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name) {
        return feignService.hello(name);
    }

    @RequestMapping(value = "/getConfig", method = RequestMethod.GET)
    public String getConfig(String name) {
        return aValue;
    }
}
