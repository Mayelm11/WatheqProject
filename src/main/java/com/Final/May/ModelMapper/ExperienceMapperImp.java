package com.Final.May.ModelMapper;

import org.modelmapper.ModelMapper;

import com.Final.May.DTO.ExpeDTO;
import com.Final.May.Mapper.ExpMapper;
import com.Final.May.model.Experience;



	public class ExperienceMapperImp implements ExpMapper{



		ModelMapper modelMapper;

		public ExperienceMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Experience dtoToDomain(ExpeDTO Experience) {
			return modelMapper.map(Experience,Experience.class );

		}


		@Override
		public  ExpeDTO domainToDto(Experience Experience) {
			return modelMapper.map(Experience,ExpeDTO.class );


		}

	}



