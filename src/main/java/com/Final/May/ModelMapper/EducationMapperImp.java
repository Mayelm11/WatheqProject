package com.Final.May.ModelMapper;


import org.modelmapper.ModelMapper;

import com.Final.May.DTO.EduDTO;
import com.Final.May.Mapper.EduMapper;
import com.Final.May.model.Education;



public class EducationMapperImp implements EduMapper{



	ModelMapper modelMapper;

	public EducationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Education dtoToDomain(EduDTO Education) {
		return modelMapper.map(Education,Education.class );

	}


	@Override
	public  EduDTO domainToDto(Education Education) {
		return modelMapper.map(Education,EduDTO.class );


	}

}

