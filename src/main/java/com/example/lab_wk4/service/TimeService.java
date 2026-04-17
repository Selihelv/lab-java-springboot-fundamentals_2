package com.example.lab_wk4.service;

import org.springframework.stereotype.Service;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {

    private LocalTime time;
    private LocalDate date;
    private DayOfWeek currentDayOfWeek;

    public String getTime() {
        return LocalTime.now().toString();
    }

    public String getDate() {
        return LocalDate.now().toString();
    }

    public String getCurrentDayOfWeek() {
        String currentDayOfWeek = LocalDate.now().getDayOfWeek().toString();
        return currentDayOfWeek;
    }


}
