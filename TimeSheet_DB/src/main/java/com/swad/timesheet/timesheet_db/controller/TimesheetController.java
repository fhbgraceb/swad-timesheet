package com.swad.timesheet.timesheet_db.controller;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.Timesheet;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//    addUser body example:
//    {
//        "username": "nabru",
//            "firstName": "Natalie",
//            "lastName": "Brucki",
//            "email": "nati@brucki.com",
//            "password": "112334556"
//    }
//    Content-Type must be "application/json"
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

//    addProject body example:
//    Super-überdrüber Projekt
//    Content-Type must be "text/plain"
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

//    addTimesheet body example:
//    {
//        "weekday": "22.01.2023",
//        "starttime": "10:10",
//        "endtime": "11:40",
//        "workinghours": 1.5,
//        "pid": 2,
//        "uid": 2
//    }
//    Content-Type must be "application/json"
    @PostMapping("/addTimesheet")
    ResponseEntity<TimesheetDto> addTimesheet(@RequestBody Timesheet_request tsr) {
        Timesheet ts = new Timesheet();
        ts.setWeekday(tsr.weekday);
        ts.setStarttime(tsr.starttime);
        ts.setEndtime(tsr.endtime);
        ts.setWorkinghours(tsr.workinghours);
        User user = userRepo.findByUid(tsr.uid);
        Project project = projectRepo.findByPid(tsr.pid);
        ts.setUser(user);
        ts.setProject(project);
        timesheetRepo.save(ts);
        return new ResponseEntity<>(tsmapper.mapToDto(ts), HttpStatus.CREATED);
    }

    static class Timesheet_request {
        public Timesheet_request() {
        }

        public Timesheet_request(String weekday, String starttime, String endtime, double workinghours, int pid, int uid) {
            this.weekday = weekday;
            this.starttime = starttime;
            this.endtime = endtime;
            this.workinghours = workinghours;
            this.pid = pid;
            this.uid = uid;
        }

        public String getWeekday() {
            return weekday;
        }

        public void setWeekday(String weekday) {
            this.weekday = weekday;
        }

        public String getStarttime() {
            return starttime;
        }

        public void setStarttime(String starttime) {
            this.starttime = starttime;
        }

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public double getWorkinghours() {
            return workinghours;
        }

        public void setWorkinghours(double workinghours) {
            this.workinghours = workinghours;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        private String weekday;
        private String starttime;
        private String endtime;
        private Double workinghours;
        private Integer pid;
        private Integer uid;
    }


}
