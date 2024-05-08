package com.example.demo;

public class FastRoute implements PathStrategy{
    @Override
    public String calculatePath(String pointA, String pointB) {
        return "Fastest route from " + pointA + " to " + pointB + " is via highway";
    }
}
