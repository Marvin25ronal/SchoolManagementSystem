package com.example.demo;

public class Gps {
    private PathStrategy pathStrategy;

    public Gps(PathStrategy pathStrategy) {
        this.pathStrategy = pathStrategy;
    }
    public void setPathStrategy(PathStrategy pathStrategy) {
        this.pathStrategy = pathStrategy;
    }
    public String getRoute(String pointA, String pointB) {
        return pathStrategy.calculatePath(pointA, pointB);
    }
}
