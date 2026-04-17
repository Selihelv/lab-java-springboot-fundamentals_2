package com.example.lab_wk4.controller;

import com.example.lab_wk4.models.Time;
import com.example.lab_wk4.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return timeService.getTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return timeService.getDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return timeService.getCurrentDayOfWeek();
    }

    @GetMapping("/all")
    public String getAll() {
        return timeService.getTime() + timeService.getDate() + timeService.getCurrentDayOfWeek();
    }

}

