package cc.wangweiye.user.feign;

import cc.wangweiye.user.feign.fallback.FeignUserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service", fallback = FeignUserFallback.class)
public interface IFeignUser {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello();
}
