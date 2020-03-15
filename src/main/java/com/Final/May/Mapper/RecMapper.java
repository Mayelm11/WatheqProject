package com.Final.May.Mapper;

import com.Final.May.DTO.RecDTO;
import com.Final.May.model.Recommendation;

public interface RecMapper {
	Recommendation dtoToDomain(final RecDTO Recommendation );

	RecDTO domainToDto(final Recommendation Recommendation );
}
