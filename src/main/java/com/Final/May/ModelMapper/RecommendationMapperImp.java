package com.Final.May.ModelMapper;


import org.modelmapper.ModelMapper;

import com.Final.May.DTO.RecDTO;
import com.Final.May.Mapper.RecMapper;
import com.Final.May.model.Recommendation;



public class RecommendationMapperImp implements RecMapper{



	ModelMapper modelMapper;

	public RecommendationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Recommendation dtoToDomain(RecDTO Recommendation) {
		return modelMapper.map(Recommendation,Recommendation.class );

	}


	@Override
	public  RecDTO domainToDto(Recommendation Recommendation) {
		return modelMapper.map(Recommendation,RecDTO.class );


	}
}

