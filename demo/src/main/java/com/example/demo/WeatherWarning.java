package com.example.demo;

public class WeatherWarning implements Observer{

    private int temperature;
    private int warningTemperature = 30;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        if(temperature > warningTemperature){
            System.out.println("Weather Warning: " + temperature);
        }
    }
}
