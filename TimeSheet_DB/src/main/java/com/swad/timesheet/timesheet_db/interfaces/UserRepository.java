package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
