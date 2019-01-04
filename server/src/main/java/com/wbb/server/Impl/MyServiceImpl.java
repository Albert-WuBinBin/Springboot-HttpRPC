package com.wbb.server.Impl;

import com.wbb.api.service.MyService;
import org.springframework.stereotype.Service;

@Service(value = "myService")
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello(String name) {
        System.out.println("调用sayHello,name:" + name);
        return "hello," + name;
    }
}
