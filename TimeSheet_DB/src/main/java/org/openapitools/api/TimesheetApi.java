/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Timesheet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-01T06:23:12.537901Z[Etc/UTC]")
@Validated
@Tag(name = "timesheet", description = "See a list of all working hours")
@RequestMapping("${openapi.timesheetOpenAPI30.base-path:}")
public interface TimesheetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /timesheet : Add a new timeslot
     * Add a new timeslot to all working hours
     *
     * @param timesheet Create a new timeslot in all working hours timesheet (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addTimeslot",
        summary = "Add a new timeslot",
        tags = { "timesheet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Timesheet.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Timesheet.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/timesheet",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Timesheet> addTimeslot(
        @Parameter(name = "Timesheet", description = "Create a new timeslot in all working hours timesheet", required = true) @Valid @RequestBody Timesheet timesheet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"StartTime\" : \"2000-01-23T04:56:07.000+00:00\", \"working-hours\" : 0.8008281904610115, \"weekday\" : \"2000-01-23\", \"EndTime\" : \"2000-01-23T04:56:07.000+00:00\", \"tid\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<timesheet> <tid>1</tid> <weekday>2000-01-23</weekday> <StartTime>2000-01-23T04:56:07.000Z</StartTime> <EndTime>2000-01-23T04:56:07.000Z</EndTime> <working-hours>3.149</working-hours> </timesheet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /timesheet : Deletes a timeslot
     * delete a timeslot
     *
     * @param apiKey  (optional)
     * @return Invalid timesheet value (status code 400)
     */
    @Operation(
        operationId = "deleteTimeslot",
        summary = "Deletes a timeslot",
        tags = { "timesheet" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid timesheet value")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/timesheet"
    )
    default ResponseEntity<Void> deleteTimeslot(
        @Parameter(name = "api_key", description = "") @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /timesheet/findTimeslot : Finds Timeslot by date
     * description coming soon ...
     *
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "findTimeslotbydate",
        summary = "Finds Timeslot by date",
        tags = { "timesheet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Timesheet.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Timesheet.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/timesheet/findTimeslot",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Timesheet> findTimeslotbydate(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"StartTime\" : \"2000-01-23T04:56:07.000+00:00\", \"working-hours\" : 0.8008281904610115, \"weekday\" : \"2000-01-23\", \"EndTime\" : \"2000-01-23T04:56:07.000+00:00\", \"tid\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<timesheet> <tid>1</tid> <weekday>2000-01-23</weekday> <StartTime>2000-01-23T04:56:07.000Z</StartTime> <EndTime>2000-01-23T04:56:07.000Z</EndTime> <working-hours>3.149</working-hours> </timesheet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /timesheet : Update an existing timeslot
     * Update an existing time by Id
     *
     * @param timesheet Update an existent time (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Timeslot not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateTime",
        summary = "Update an existing timeslot",
        tags = { "timesheet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Timesheet.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Timesheet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Timeslot not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/timesheet",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Timesheet> updateTime(
        @Parameter(name = "Timesheet", description = "Update an existent time", required = true) @Valid @RequestBody Timesheet timesheet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"StartTime\" : \"2000-01-23T04:56:07.000+00:00\", \"working-hours\" : 0.8008281904610115, \"weekday\" : \"2000-01-23\", \"EndTime\" : \"2000-01-23T04:56:07.000+00:00\", \"tid\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<timesheet> <tid>1</tid> <weekday>2000-01-23</weekday> <StartTime>2000-01-23T04:56:07.000Z</StartTime> <EndTime>2000-01-23T04:56:07.000Z</EndTime> <working-hours>3.149</working-hours> </timesheet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}