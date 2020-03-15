package com.Final.May.Mapper;

import com.Final.May.DTO.EduDTO;
import com.Final.May.model.Education;

public interface EduMapper {

	Education dtoToDomain(final EduDTO Education);

	EduDTO domainToDto(final Education Education );
}
