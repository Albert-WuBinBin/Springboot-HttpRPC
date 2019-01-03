package com.wbb.rpcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.wbb")
public class RpcserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcserverApplication.class, args);
	}

}

