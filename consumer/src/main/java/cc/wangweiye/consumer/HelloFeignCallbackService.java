package cc.wangweiye.consumer;

import org.springframework.stereotype.Service;

@Service
public class HelloFeignCallbackService implements HelloFeignService {
    @Override
    public String hello(String name) {
        return "调用失败，服务降级！";
    }
}
