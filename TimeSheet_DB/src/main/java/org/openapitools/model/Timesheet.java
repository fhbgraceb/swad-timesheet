package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Timesheet
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-01T06:23:12.537901Z[Etc/UTC]")
public class Timesheet {

  @JsonProperty("tid")
  private Long tid;

  @JsonProperty("weekday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate weekday;

  @JsonProperty("StartTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @JsonProperty("EndTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime;

  @JsonProperty("working-hours")
  private Double workingHours;

  public Timesheet tid(Long tid) {
    this.tid = tid;
    return this;
  }

  /**
   * Get tid
   * @return tid
  */
  
  @Schema(name = "tid", example = "1", required = false)
  public Long getTid() {
    return tid;
  }

  public void setTid(Long tid) {
    this.tid = tid;
  }

  public Timesheet weekday(LocalDate weekday) {
    this.weekday = weekday;
    return this;
  }

  /**
   * Get weekday
   * @return weekday
  */
  @Valid 
  @Schema(name = "weekday", required = false)
  public LocalDate getWeekday() {
    return weekday;
  }

  public void setWeekday(LocalDate weekday) {
    this.weekday = weekday;
  }

  public Timesheet start(OffsetDateTime start) {
    this.startTime = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @Valid 
  @Schema(name = "Start", required = false)
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Timesheet end(OffsetDateTime end) {
    this.endTime = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @Valid 
  @Schema(name = "End", required = false)
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Timesheet workingHours(Double workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  /**
   * Get workingHours
   * @return workingHours
  */
  
  @Schema(name = "working-hours", required = false)
  public Double getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(Double workingHours) {
    this.workingHours = workingHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.tid, timesheet.tid) &&
        Objects.equals(this.weekday, timesheet.weekday) &&
        Objects.equals(this.startTime, timesheet.startTime) &&
        Objects.equals(this.endTime, timesheet.endTime) &&
        Objects.equals(this.workingHours, timesheet.workingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, weekday, startTime, endTime, workingHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
    sb.append("    start: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    end: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

