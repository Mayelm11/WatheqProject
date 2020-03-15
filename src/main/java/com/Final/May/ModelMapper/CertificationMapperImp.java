package com.Final.May.ModelMapper;


import org.modelmapper.ModelMapper;

import com.Final.May.DTO.CertDTO;
import com.Final.May.Mapper.CertMapper;
import com.Final.May.model.Certification;



public class CertificationMapperImp implements CertMapper{



	ModelMapper modelMapper;

	public CertificationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Certification dtoToDomain(CertDTO Certification) {
		return modelMapper.map(Certification,Certification.class );

	}


	@Override
	public  CertDTO domainToDto(Certification Certification) {
		return modelMapper.map(Certification,CertDTO.class );


	}



}
