package com.nagarro.employeemanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeemanagementApplication {

	//private static final Logger log= LoggerFactory.getLogger(EmployeemanagementApplication.class);

	@Value("${service.instance.name}")
	private String instance;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);
	}

}
