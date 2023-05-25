package com.lm.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSerivceApplication.class, args);
	}

}
