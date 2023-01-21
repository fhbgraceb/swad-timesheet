package com.swad.timesheet.timesheet_db.controller;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.User;
import com.swad.timesheet.timesheet_db.interfaces.ProjectHourRepository;
import com.swad.timesheet.timesheet_db.interfaces.ProjectRepository;
import com.swad.timesheet.timesheet_db.interfaces.TimesheetRepository;
import com.swad.timesheet.timesheet_db.interfaces.UserRepository;
import com.swad.timesheet.timesheet_db.service.TimesheetServiceImpl;
import com.swad.timesheet.timesheet_db.service.mapper.TimesheetMapper;
import com.swad.timesheet.timesheet_db.service.mapper.UserMapper;
import dto.TimesheetDto;
import dto.UserDto;
import org.hibernate.annotations.SQLInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class TimesheetController
{

    @Autowired
    TimesheetServiceImpl tsService;

    @Autowired
    UserRepository userRepo;

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    ProjectHourRepository projectHourRepo;

    @Autowired
    TimesheetRepository timesheetRepo;

    @Autowired
    UserMapper umapper;

    @Autowired
    TimesheetMapper tsmapper;

    @RequestMapping("/")
    String home() {
        return "Hello Backend!";
    }

    @PostMapping("/addUser")
    ResponseEntity<UserDto> addUser(@RequestBody User user) {
        userRepo.save(user);
        return new ResponseEntity<>(umapper.mapToDto(user), HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    List<UserDto> getUsers() {
        List<User> list = userRepo.findAll();
        return umapper.mapToDto(list);
    }

    @GetMapping("/getUserbyUsername/{name}")
    List<UserDto> getUserbyUsername(@PathVariable String name) {
        return umapper.mapToDto(userRepo.findByUsernameContainsIgnoreCase(name));
    }

    @GetMapping("/getProjects")
    List<Project> getProjects() {
        return projectRepo.findAll();
    }

    @PostMapping("/addProject")
    ResponseEntity<Project> addProject(@RequestBody String name) {
        Project pj = new Project();
        pj.setName(name);
        projectRepo.save(pj);
        return new ResponseEntity<>(pj, HttpStatus.CREATED);
    }

    @GetMapping("/getTimesheets")
    List<TimesheetDto> getTimesheets() {
        return tsmapper.mapToDto(timesheetRepo.findAll());
    }

    @GetMapping("/getTimesheets/{username}")
    List<TimesheetDto> getTimesheets(@PathVariable String username) {
        return tsmapper.mapToDto(timesheetRepo.findByUser(userRepo.findByUsernameContainsIgnoreCase(username).get(0)));
    }


}
