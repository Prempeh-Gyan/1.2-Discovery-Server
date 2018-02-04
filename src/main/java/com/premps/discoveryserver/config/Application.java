package com.premps.discoveryserver.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Standing up an instance of the Eureka service registry is very easy, add
 * spring-cloud-starter-eureka-server to your classpath and annotate your class
 * with the '@EnableEurekaServer' annotation. Spring cloud will then auto
 * configure this instance when started.
 * 
 * @author Prempeh Gyan
 * @since 04/02/2018
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
