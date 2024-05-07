package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AppConfig config= AppConfig.getInstance();
		config.setName("Demo Application");
		config.setVersion("1.0.0");
		System.out.println("Application Name: "+config.getName());
		System.out.println("Application Version: "+config.getVersion());

	}

}
