package com.wbb.rpcserver.Service.Impl;

import com.wbb.rpcapi.service.MyService;
import org.springframework.stereotype.Service;

@Service(value = "myService")
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello(String name) {
        System.out.println("调用sayHello");
        return "hello,"+name;
    }
}
