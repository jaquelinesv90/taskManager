package com.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
  
@SpringBootApplication(scanBasePackages = "com.*")
@EntityScan(basePackages="com.model")
@ComponentScan(basePackages= {"com.*"})
@EnableJpaRepositories(basePackages= {"com.repository"})
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
