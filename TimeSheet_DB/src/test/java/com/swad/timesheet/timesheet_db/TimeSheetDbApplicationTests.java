package com.swad.timesheet.timesheet_db;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.User;
import com.swad.timesheet.timesheet_db.interfaces.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TimeSheetDbApplicationTests {

    @Autowired
    ProjectRepository projectRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateUser() {
        projectRepository.save(Project.builder().name("MasterTestProject").build());
        projectRepository.save(Project.builder().name("TestProject").build());
        projectRepository.save(Project.builder().name("TinyTestProject").build());
        System.out.println(projectRepository.count());
        List<Project> projects = projectRepository.findAll();
        projects.forEach(System.out::println);
    }

}