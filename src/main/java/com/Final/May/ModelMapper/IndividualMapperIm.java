package com.Final.May.ModelMapper;



import org.modelmapper.ModelMapper;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.Mapper.IndividualMapper;
import com.Final.May.model.Individual;



public class IndividualMapperIm implements IndividualMapper{



	ModelMapper modelMapper;

	public IndividualMapperIm() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Individual dtoToDomain(IndivDTO individual) {
		return modelMapper.map(individual,Individual.class );

	}


	@Override
	public  IndivDTO domainToDto(Individual individual) {
		return modelMapper.map(individual,IndivDTO.class );


	}


}

