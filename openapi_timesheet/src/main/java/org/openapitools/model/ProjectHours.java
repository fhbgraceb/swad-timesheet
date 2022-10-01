package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectHours
 */

@JsonTypeName("Project-hours")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-01T06:23:12.537901Z[Etc/UTC]")
public class ProjectHours {

  @JsonProperty("pid")
  private Long pid;

  @JsonProperty("tid")
  private Long tid;

  @JsonProperty("working-hours")
  private Double workingHours;

  public ProjectHours pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
  */
  
  @Schema(name = "pid", example = "1", required = false)
  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }

  public ProjectHours tid(Long tid) {
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

  public ProjectHours workingHours(Double workingHours) {
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
    ProjectHours projectHours = (ProjectHours) o;
    return Objects.equals(this.pid, projectHours.pid) &&
        Objects.equals(this.tid, projectHours.tid) &&
        Objects.equals(this.workingHours, projectHours.workingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, tid, workingHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHours {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
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

