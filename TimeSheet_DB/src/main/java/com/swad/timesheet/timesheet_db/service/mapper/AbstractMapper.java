package com.swad.timesheet.timesheet_db.service.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMapper<ENTITY, DTO> implements Mapper<ENTITY, DTO> {

    public List<DTO> mapToDto(Collection<ENTITY> entities) {
        List<DTO> dtos = new ArrayList<>();
        entities.forEach(entity -> dtos.add(mapToDto(entity)));
        return dtos;
    }
}

