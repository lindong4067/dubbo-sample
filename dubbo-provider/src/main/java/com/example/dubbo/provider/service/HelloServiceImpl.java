package com.example.dubbo.provider.service;

import com.example.dubbo.api.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
