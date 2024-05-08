package com.example.demo;

public class ShortPath implements PathStrategy{
@Override
    public String calculatePath(String pointA, String pointB) {
        return "Shortest path from " + pointA + " to " + pointB + " is via subway";
    }
}
