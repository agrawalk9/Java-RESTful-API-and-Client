package com.nagarro.employeemanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeemanagementApplication {

	//private static final Logger log= LoggerFactory.getLogger(EmployeemanagementApplication.class);

	@Value("${service.instance.name}")
	private String instance;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);
		System.out.println("Hello World");
	}

}
