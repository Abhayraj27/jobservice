package com.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"com.job"})
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class JobserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobserviceApplication.class, args);
	}

}
