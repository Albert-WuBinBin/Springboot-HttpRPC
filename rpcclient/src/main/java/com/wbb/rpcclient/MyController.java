package com.wbb.rpcclient;

import com.wbb.rpcapi.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpc")
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public Object test(String name){
        return myService.sayHello(name);
    }
}
