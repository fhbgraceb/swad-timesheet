package com.swad.timesheet.timesheet_db.service.mapper;

public interface Mapper<ENTITY, DTO> {

    DTO mapToDto(ENTITY entity);
    ENTITY mapToEntity(DTO dto);

}