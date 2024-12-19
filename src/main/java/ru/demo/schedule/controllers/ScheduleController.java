package ru.demo.schedule.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.demo.schedule.model.ScheduleResponse;
import ru.demo.schedule.services.ScheduleDao;
import ru.demo.schedule.services.ScheduleService;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    private final ScheduleService scheduleService;
    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedule")
    public ScheduleResponse getSchedule(){
        return scheduleService.getSchedule();
    }
}
