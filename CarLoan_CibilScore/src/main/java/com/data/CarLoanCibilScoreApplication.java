package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CarLoanCibilScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarLoanCibilScoreApplication.class, args);
	}

}
