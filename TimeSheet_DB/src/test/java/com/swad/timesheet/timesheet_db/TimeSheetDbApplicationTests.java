package com.swad.timesheet.timesheet_db;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.Timesheet;
import com.swad.timesheet.timesheet_db.entity.User;
import com.swad.timesheet.timesheet_db.interfaces.ProjectRepository;
import com.swad.timesheet.timesheet_db.interfaces.TimesheetRepository;
import com.swad.timesheet.timesheet_db.interfaces.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TimeSheetDbApplicationTests {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    TimesheetRepository timesheetRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateProject() {
        projectRepository.save(Project.builder().name("MasterTestProject").build());
        projectRepository.save(Project.builder().name("TestProject").build());
        projectRepository.save(Project.builder().name("TinyTestProject").build());
        System.out.println(projectRepository.count());
        List<Project> projects = projectRepository.findAll();
        projects.forEach(System.out::println);
    }

    @Test
    void testCreateUser(){
        User Testuser = User.builder().username("Semmel").build();
//        Testuser.setEmail("Testmail");
//        Testuser.setPassword("testpw");
//        Testuser.setLastName("TestLN");
//        Testuser.setFirstName("TestFN");
//        Testuser.setId(100);
//        userRepository.save(Testuser);
        userRepository.save(User.builder().username("Semmel").build());
       // userRepository.save(User.builder().username("Semmel").firstName("Herr").lastName("Semmel").email("herr.semmel@katze.org").password("Kratzbaum123").build());
        userRepository.save(User.builder().username("Brösel").firstName("Frau").lastName("Brösel").email("frau.broesel@meerschweinchen.com").password("erbsenflocke666").build());
        List<User> user = userRepository.findByUsernameContainsIgnoreCase("semmel");
        user.forEach(System.out::println);
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
        System.out.println(userRepository.count());
    }

    @Test
    void testTimeSheet(){
        timesheetRepository.save(Timesheet.builder().startTime("8.00").endTime("15.00").workingHours(8.0).weekday("Monday").build());
    }



}