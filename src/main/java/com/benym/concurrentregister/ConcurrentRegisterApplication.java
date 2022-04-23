package com.benym.concurrentregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ConcurrentRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcurrentRegisterApplication.class, args);
    }

}
