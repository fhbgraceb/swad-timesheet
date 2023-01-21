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
                .starttime(timesheet.getStarttime())
                .endtime(timesheet.getEndtime())
                .workinghours(timesheet.getWorkinghours())
                .project(timesheet.getProject())
                .user(userMapper.mapToDto(timesheet.getUser()))
                .build();
    }

    @Override
    public Timesheet mapToEntity(TimesheetDto timesheetDto) {
        return Timesheet.builder()
                .tid(timesheetDto.getTid())
                .weekday(timesheetDto.getWeekday())
                .starttime(timesheetDto.getStarttime())
                .endtime(timesheetDto.getEndtime())
                .workinghours(timesheetDto.getWorkinghours())
                .project(timesheetDto.getProject())
                .user(userMapper.mapToEntity(timesheetDto.getUser()))
                .build();

    }
}
