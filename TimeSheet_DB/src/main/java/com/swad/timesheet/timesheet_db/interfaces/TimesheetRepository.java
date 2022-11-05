package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

}
