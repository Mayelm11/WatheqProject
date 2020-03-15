package com.Final.May.Mapper;

import com.Final.May.DTO.CompDTO;
import com.Final.May.model.Company;

public interface ComMapper {

	Company dtoToDomain(final CompDTO Company );

	CompDTO domainToDto(final Company Company );


}
