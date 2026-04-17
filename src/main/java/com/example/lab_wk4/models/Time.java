package com.example.lab_wk4.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    private LocalTime time;
    private LocalDate date;
    private DayOfWeek currentDayOfWeek;

    public Time(LocalTime time, LocalDate date, DayOfWeek currentDayOfWeek) {
        this.time = time;
        this.date = date;
        this.currentDayOfWeek = currentDayOfWeek;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DayOfWeek getCurrentDayOfWeek() {
        return currentDayOfWeek;
    }

    public void setCurrentDayOfWeek(DayOfWeek currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }
}
