package com.wbb.server.config;

import com.wbb.api.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Component;

@Component
public class HttpInvokerConfig {

    @Autowired
    private MyService myService;

    @Bean(value = "/httpinvoker")
    public HttpInvokerServiceExporter newInstance(){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(MyService.class);
        exporter.setService(myService);
        return exporter;
    }
}
