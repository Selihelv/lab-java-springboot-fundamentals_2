package com.example.lab_wk4.models;

public class Weather {
    private int temperature;
    private String condition;
    private int windspeed;

    public Weather(int temperature, String condition, int speed) {
        this.temperature = temperature;
        this.condition = condition;
        this.windspeed = speed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(int windspeed) {
        this.windspeed = windspeed;
    }
}
