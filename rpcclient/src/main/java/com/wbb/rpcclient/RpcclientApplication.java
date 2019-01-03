package com.wbb.rpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wbb")
@EnableConfigurationProperties
public class RpcclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcclientApplication.class, args);
	}

}

