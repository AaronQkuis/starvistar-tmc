package com.starvistar.tmc.dubbo.service;

import com.starvistar.tmc.dubbo.api.DemoService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}