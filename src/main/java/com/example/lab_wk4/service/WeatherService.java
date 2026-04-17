package com.example.lab_wk4.service;

import com.example.lab_wk4.models.Weather;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {
    private int temp = new Random().nextInt(-10, 41);
    private int condition= new Random().nextInt(0,3);
    private int windSpeed = new Random().nextInt(0, 100);

    public int getTemperature(){
        return temp;
    }

    public String getCondition(){
        if (condition == 0 ){
            return "Sunny";
        } else if ( condition == 1){
            return "Rainy";
        } else if ( condition == 2){
            return "Cloudy";
        } else {
            return "Windy";
        }
    }

    public int getWindSpeed(){
        return windSpeed;
    }

    public Weather getAll(){
        return new Weather(temp, getCondition(),windSpeed);
    }
}
