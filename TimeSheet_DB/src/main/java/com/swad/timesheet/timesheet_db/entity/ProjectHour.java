//class not necessary - User and project linked to timesheet

package com.swad.timesheet.timesheet_db.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "PROJECT_HOUR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectHour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phid;
    private double bookedhours;

    @ManyToOne
    @JoinColumn(name = "Timesheet_tid", nullable = false)
    private Timesheet timesheet;
    @ManyToOne
    @JoinColumn(name = "Project_pid", nullable = false)
    private Project project;


}
