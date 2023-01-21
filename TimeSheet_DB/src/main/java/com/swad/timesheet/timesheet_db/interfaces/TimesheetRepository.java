package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.Project;
import com.swad.timesheet.timesheet_db.entity.Timesheet;
import com.swad.timesheet.timesheet_db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

       List<Timesheet> findByUser(User user);
       List<Timesheet> findByProject (Project project);
       List<Timesheet> findByStarttime (String time);
       List<Timesheet> findByWeekday (String time);
}
