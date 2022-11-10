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
import org.junit.jupiter.api.Assertions;
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

        Assertions.assertEquals(3, projectRepository.count());

        Assertions.assertNotNull(projectRepository.findByNameContainingIgnoreCase("TestProject"));
    }

    @Test
    void testCreateUser(){
        userRepository.save(User.builder().username("Semmel").build());
        userRepository.save(User.builder().username("Brösel").firstName("Frau").lastName("Brösel").email("frau.broesel@meerschweinchen.com").password("erbsenflocke666").build());
    
        Assertions.assertEquals(2, userRepository.count());

        Assertions.assertNotNull(userRepository.findByUsernameContainsIgnoreCase("Brösel"));

        Assertions.assertNotNull(userRepository.findByUsernameContainsIgnoreCase("semmel"));
    }

    @Test
    void testTimeSheet(){
        userRepository.save(User.builder().username("Watson").build());
        projectRepository.save(Project.builder().name("FindCatName").build());
        List<User> users = userRepository.findByUsernameContainsIgnoreCase("watson");
        User user = users.get(0);
        List<Project> projects = projectRepository.findByNameContainingIgnoreCase("findcatname");
        Project project = projects.get(0);
        timesheetRepository.save(Timesheet.builder().startTime("8.00").endTime("15.00").workingHours(8.0).weekday("Monday").project(project).user(user).build());
        
        Assertions.assertNotNull(timesheetRepository.findByProject(project));

        Assertions.assertNotNull(timesheetRepository.findByStartTime("8.00"));

        Assertions.assertNotNull(timesheetRepository.findByWeekday("Monday")); 

    }



}