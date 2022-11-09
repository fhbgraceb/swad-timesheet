package com.swad.timesheet.timesheet_db.service;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.Timesheet;
import com.swad.timesheet.timesheet_db.interfaces.TimesheetRepository;
import com.swad.timesheet.timesheet_db.service.mapper.TimesheetMapper;
import com.swad.timesheet.timesheet_db.service.mapper.UserMapper;
import dto.TimesheetDto;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
}
