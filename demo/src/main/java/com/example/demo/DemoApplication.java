package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Gps gps = new Gps(new ShortPath());
		System.out.println(gps.getRoute("A", "B"));
		gps.setPathStrategy(new EconomicPath());
		System.out.println(gps.getRoute("A", "B"));
		gps.setPathStrategy(new FastRoute());
		System.out.println(gps.getRoute("A", "B"));


	}

}
