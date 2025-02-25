package com.tcs.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CreditScoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(CreditScoreApplication.class, args);
	}
}
