package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    //    List<User> findByUsernameContainsIgnoreCase(String username);
    List<Project> findByNameContainingIgnoreCase(String name);

    Project findByPid(int pid);
}
