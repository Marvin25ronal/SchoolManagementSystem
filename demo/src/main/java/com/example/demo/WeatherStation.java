package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observers;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    int temperature;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature);
        }
    }

}
