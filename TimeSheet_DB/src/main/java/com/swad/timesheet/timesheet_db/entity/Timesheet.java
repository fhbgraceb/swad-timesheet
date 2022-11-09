package com.swad.timesheet.timesheet_db.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tid;
    private String weekday;
    private String startTime;
    private String endTime;
    private double workingHours;

    @ManyToOne
    @JoinColumn(name="Project_pid", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name="User_uid", nullable = false)
    private User user;
    //project
    //user
}
