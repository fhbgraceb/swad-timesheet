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
    private Long tid;
    private String weekday;
    private String start;
    private String end;
    private double workingHours;
}
