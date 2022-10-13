package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.ProjectHour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectHourRepository extends JpaRepository <ProjectHour, Long> {
}
