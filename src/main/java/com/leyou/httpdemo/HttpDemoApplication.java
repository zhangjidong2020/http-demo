package com.leyou.httpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;

@SpringBootApplication
public class HttpDemoApplication {

	//restTemplate直接声明没有任何参数时，底层实现用的是JDK的URLConection，如果需要改变，可以在构造器中传入对应的工厂对象
	@Bean
	public RestTemplate restTemplate() {
		//此时有了参数，使用OKHttp来作为底层实现
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(HttpDemoApplication.class, args);
	}




}
