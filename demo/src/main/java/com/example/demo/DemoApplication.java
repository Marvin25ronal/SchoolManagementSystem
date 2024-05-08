package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	WeatherStation weatherStation = new WeatherStation();
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

		weatherStation.registerObserver(temperatureDisplay);
		WeatherWarning weatherWarning = new WeatherWarning();
		weatherStation.registerObserver(weatherWarning);
		weatherStation.setTemperature(33);
		weatherStation.notifyObservers();
		weatherStation.setTemperature(10);
		weatherStation.notifyObservers();

	}

}
