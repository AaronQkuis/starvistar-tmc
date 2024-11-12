package com.starvistar.tmc.dubbo.consumer;

import com.starvistar.tmc.dubbo.api.DemoService;

import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {

        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }
}
