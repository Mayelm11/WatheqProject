package com.Final.May.Mapper;

import com.Final.May.DTO.LangDTO;
import com.Final.May.model.Language;

public interface LangMapper {

	Language dtoToDomain(final LangDTO Language );

	LangDTO domainToDto(final Language Language );
}
