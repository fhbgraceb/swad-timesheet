package com.swad.timesheet.timesheet_db.interfaces;

import com.swad.timesheet.timesheet_db.entity.User;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameContainsIgnoreCase(String username);
    User findByUid(int uid);

}
