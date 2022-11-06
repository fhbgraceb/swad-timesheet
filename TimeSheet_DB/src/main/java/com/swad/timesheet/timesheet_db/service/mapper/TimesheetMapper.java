package com.swad.timesheet.timesheet_db.service.mapper;

import com.swad.timesheet.timesheet_db.entity.Timesheet;
import dto.TimesheetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimesheetMapper extends AbstractMapper<Timesheet, TimesheetDto> {
    @Autowired
    private UserMapper userMapper;
    @Override
    public TimesheetDto mapToDto(Timesheet timesheet) {
        return TimesheetDto.builder()
                .tid(timesheet.getTid())
                .weekday(timesheet.getWeekday())
                .startTime(timesheet.getStartTime())
                .endTime(timesheet.getEndTime())
                .workingHours(timesheet.getWorkingHours())
                .project(timesheet.getProject())
                .user(userMapper.mapToDto(timesheet.getUser()))
                .build();
    }

    @Override
    public Timesheet mapToEntity(TimesheetDto timesheetDto) {
        return Timesheet.builder()
                .tid(timesheetDto.getTid())
                .weekday(timesheetDto.getWeekday())
                .startTime(timesheetDto.getStartTime())
                .endTime(timesheetDto.getEndTime())
                .workingHours(timesheetDto.getWorkingHours())
                .project(timesheetDto.getProject())
                .user(userMapper.mapToEntity(timesheetDto.getUser()))
                .build();

    }
}
