package com.micro.Cliente1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cliente1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cliente1Application.class, args);
	}

}
