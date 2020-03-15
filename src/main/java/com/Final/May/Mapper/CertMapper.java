package com.Final.May.Mapper;

import com.Final.May.DTO.CertDTO;
import com.Final.May.model.Certification;

public interface CertMapper {
	Certification dtoToDomain(final CertDTO Certification );

	CertDTO domainToDto(final Certification Certification );
}
