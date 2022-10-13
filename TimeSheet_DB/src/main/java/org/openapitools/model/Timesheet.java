package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
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

  @JsonProperty("Start")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime start;

  @JsonProperty("End")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime end;

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
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @Valid 
  @Schema(name = "Start", required = false)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Timesheet end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @Valid 
  @Schema(name = "End", required = false)
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
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
        Objects.equals(this.start, timesheet.start) &&
        Objects.equals(this.end, timesheet.end) &&
        Objects.equals(this.workingHours, timesheet.workingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, weekday, start, end, workingHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

