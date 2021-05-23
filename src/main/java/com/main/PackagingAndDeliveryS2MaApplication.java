package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PackagingAndDeliveryS2MaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagingAndDeliveryS2MaApplication.class, args);
	}

}
