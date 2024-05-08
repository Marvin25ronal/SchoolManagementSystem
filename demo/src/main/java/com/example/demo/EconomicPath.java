package com.example.demo;

public class EconomicPath implements PathStrategy{
    @Override
    public String calculatePath(String pointA, String pointB) {
        return "Economic path from " + pointA + " to " + pointB + " is via bus";
    }
}
