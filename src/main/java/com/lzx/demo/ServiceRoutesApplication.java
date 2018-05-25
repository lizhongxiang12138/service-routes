package com.lzx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.TimeZone;

@EnableZuulProxy
@SpringBootApplication
public class ServiceRoutesApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SpringApplication.run(ServiceRoutesApplication.class, args);
	}
}
