package com.synerzip.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class B1ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(B1ConfigServerApplication.class, args);
	}
}
