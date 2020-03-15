package com.Final.May.Mapper;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.model.Individual;


public interface IndividualMapper {


	Individual dtoToDomain(final IndivDTO individual );

	IndivDTO domainToDto(final Individual individual );





}

