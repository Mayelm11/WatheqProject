package com.Final.May.ModelMapper;



import org.modelmapper.ModelMapper;

import com.Final.May.DTO.LangDTO;
import com.Final.May.Mapper.LangMapper;
import com.Final.May.model.Language;



public class LanguageMapperImp implements LangMapper{



	ModelMapper modelMapper;

	public LanguageMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Language dtoToDomain(LangDTO Language) {
		return modelMapper.map(Language,Language.class );

	}


	@Override
	public  LangDTO domainToDto(Language Language) {
		return modelMapper.map(Language,LangDTO.class );


	}


}



