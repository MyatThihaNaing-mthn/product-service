package com.thiha.sneakershop.productserivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductserivceApplication {
	@Autowired
	static
	Environment environment;
	public static void main(String[] args) {
		SpringApplication.run(ProductserivceApplication.class, args);
		String port = environment.getProperty("local.server.port");
		System.out.println(port);
	}

}
