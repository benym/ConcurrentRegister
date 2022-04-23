package com.benym.concurrentregister.controller;

import com.benym.concurrentregister.dto.UserDTO;
import com.benym.concurrentregister.response.RestResponse;
import com.benym.distributed.redis.annotation.DistributedLock;
import com.benym.distributed.redis.annotation.DistributedRateLimit;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.redisson.api.RateType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time : 2022/4/23 17:34
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/register")
    @HystrixCommand(fallbackMethod = "registerFallback",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 失败超过阈值触发熔断策略
                    @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"), // 使用信号量计数
                    @HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests", value = "20") // 并发信号20
            })
    @DistributedRateLimit(key = "U_Register", rateType = RateType.PER_CLIENT, rate = 1, rateInterval = 5)
    public RestResponse userRegister(@RequestBody @Validated UserDTO userDTO) throws Exception{
        return RestResponse.succuess(true, "注册成功了");
    }

    public RestResponse registerFallback(UserDTO userDTO) {
        throw new RuntimeException("前方拥挤，稍后再试" + userDTO);
//        return RestResponse.fail(ResultCode.FAIL.code(),"前方拥挤，稍后再试");
    }
}
