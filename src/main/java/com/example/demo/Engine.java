package com.example.demo;

public class Engine {
    private boolean engineStatus;

    private String name;

    public Engine(boolean engineStatus, String name) {
        this.engineStatus = engineStatus;
        this.name = name;
    }

    public boolean getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }
}