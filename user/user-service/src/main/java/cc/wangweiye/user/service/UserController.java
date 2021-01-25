package cc.wangweiye.user.service;

import cc.wangweiye.user.feign.IFeignUser;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IFeignUser {
    @Override
    public String sayHello() {
        return "你看见我就成功了！";
    }
}
