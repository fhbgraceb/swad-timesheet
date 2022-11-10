package com.swad.timesheet.timesheet_db.service;

import com.swad.timesheet.timesheet_db.entity.Project;
import dto.TimesheetDto;
import dto.UserDto;

import java.util.List;

public interface TimesheetService {

    List<TimesheetDto> getTimesheetsbyUser(UserDto user);
    List<TimesheetDto> getTimesheetsbyProject (Project project);
    List<TimesheetDto> getTimesheetsByStartingTime (String time);
    List<TimesheetDto> findByWeekday(String string); 

}
