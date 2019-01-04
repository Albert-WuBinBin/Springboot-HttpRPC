package com.wbb.client.config;

import com.wbb.api.service.MyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class HttpInvokerConfig {

    @Value("${rpcserver.url}")
    private String romoteUrl ;

    @Bean("myService")
    public HttpInvokerProxyFactoryBean newInstance(){
        HttpInvokerProxyFactoryBean bean = new HttpInvokerProxyFactoryBean();
        bean.setServiceUrl(romoteUrl);
        bean.setServiceInterface(MyService.class);
        return bean;
    }
}
