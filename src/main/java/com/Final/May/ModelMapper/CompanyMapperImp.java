package com.Final.May.ModelMapper;



import org.modelmapper.ModelMapper;

import com.Final.May.DTO.CompDTO;
import com.Final.May.Mapper.ComMapper;
import com.Final.May.model.Company;



public class CompanyMapperImp implements ComMapper{



	ModelMapper modelMapper;

	public CompanyMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Company dtoToDomain(CompDTO Company) {
		return modelMapper.map(Company,Company.class );

	}


	@Override
	public  CompDTO domainToDto(Company Company) {
		return modelMapper.map(Company,CompDTO.class );


	}


}


