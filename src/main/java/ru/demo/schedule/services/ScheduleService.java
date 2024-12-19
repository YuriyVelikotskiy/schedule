package ru.demo.schedule.services;

import org.springframework.stereotype.Service;
import ru.demo.schedule.model.ScheduleResponse;

@Service
public class ScheduleService {
    final private ScheduleDao scheduleDao;
    public ScheduleService(ScheduleDao scheduleDao){
        this.scheduleDao = scheduleDao;
    }

    public ScheduleResponse getSchedule() {
        return new ScheduleResponse();
    }
}
