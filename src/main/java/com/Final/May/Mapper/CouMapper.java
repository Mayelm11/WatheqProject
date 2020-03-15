package com.Final.May.Mapper;

import com.Final.May.DTO.CouDTO;
import com.Final.May.model.Course;

public interface CouMapper {

	Course dtoToDomain(final CouDTO Course );

	CouDTO domainToDto(final Course Course );

}
