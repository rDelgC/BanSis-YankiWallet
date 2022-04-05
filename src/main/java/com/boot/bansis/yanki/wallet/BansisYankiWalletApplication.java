package com.boot.bansis.yanki.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing
@EnableEurekaClient
public class BansisYankiWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(BansisYankiWalletApplication.class, args);
	}

}
