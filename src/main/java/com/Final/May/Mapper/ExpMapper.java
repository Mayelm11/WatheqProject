package com.Final.May.Mapper;

import com.Final.May.DTO.ExpeDTO;
import com.Final.May.model.Experience;

public interface ExpMapper {

	Experience dtoToDomain(final ExpeDTO Experience );

	ExpeDTO domainToDto(final Experience Experience );
}
