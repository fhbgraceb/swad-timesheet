package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
