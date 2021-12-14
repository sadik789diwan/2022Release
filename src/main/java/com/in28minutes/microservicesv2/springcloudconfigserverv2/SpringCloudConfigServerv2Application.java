package com.in28minutes.microservicesv2.springcloudconfigserverv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerv2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerv2Application.class, args);
	}

}
