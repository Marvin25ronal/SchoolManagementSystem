package com.example.demo;

public class TemperatureDisplay  implements Observer{
    private int temperature;


    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: " + temperature);
    }


}
