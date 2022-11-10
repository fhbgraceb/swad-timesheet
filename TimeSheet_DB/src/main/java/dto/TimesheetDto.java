package dto;


import com.swad.timesheet.timesheet_db.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class TimesheetDto {
    private int tid;
    private String weekday;
    private String startTime;
    private String endTime;
    private double workingHours;

    private Project project;

    private UserDto user;


}