package cc.wangweiye.user.feign.fallback;

import cc.wangweiye.user.feign.IFeignUser;
import org.springframework.stereotype.Service;

@Service
public class FeignUserFallback implements IFeignUser {
    @Override
    public String sayHello() {
        return "降级处理";
    }
}
