package com.swad.timesheet.timesheet_db.service;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.Timesheet;
import com.swad.timesheet.timesheet_db.interfaces.TimesheetRepository;
import com.swad.timesheet.timesheet_db.service.mapper.TimesheetMapper;
import com.swad.timesheet.timesheet_db.service.mapper.UserMapper;
import dto.TimesheetDto;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimesheetServiceImpl implements TimesheetService {

    @Autowired
    private TimesheetRepository timesheetRepository;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TimesheetMapper timesheetMapper;

    @Override
    public List<TimesheetDto> getTimesheetsbyUser(UserDto user) {
        List<Timesheet> timesheets = timesheetRepository.findByUser(userMapper.mapToEntity(user));
        return timesheetMapper.mapToDto(timesheets);
    }

    @Override
    public List<TimesheetDto> getTimesheetsbyProject(Project project) {
        List<Timesheet> timesheets = timesheetRepository.findByProject(project);
        return timesheetMapper.mapToDto(timesheets);
    }

    @Override
    public List<TimesheetDto> getTimesheetsByStartingTime(String time) {
        List<Timesheet> allTimesheets = timesheetRepository.findAll();
        List<Timesheet> timesheets = new ArrayList<Timesheet>();
        allTimesheets.forEach((temp) -> {
            if (temp.getStarttime() == time){
                timesheets.add(temp);
            }
        });
        return timesheetMapper.mapToDto(timesheets);
    }

    @Override
    public List<TimesheetDto> findByWeekday(String weekday) {
        List<Timesheet> allTimesheets = timesheetRepository.findAll();
        List<Timesheet> timesheets = new ArrayList<Timesheet>();
        allTimesheets.forEach((temp) -> {
            if (temp.getWeekday() == weekday){
                timesheets.add(temp);
            } 
        });
        return timesheetMapper.mapToDto(timesheets);
    }
}
