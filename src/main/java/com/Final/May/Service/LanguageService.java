package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.LangDTO;
import com.Final.May.ModelMapper.LanguageMapperImp;
import com.Final.May.model.Language;
import com.Final.May.repository.LanguageRepository;

import lombok.AllArgsConstructor;

	@AllArgsConstructor
	@Service
	public class LanguageService {

		private LanguageRepository languageRepository;
		private static final LanguageMapperImp LangMapper = new LanguageMapperImp();

		public LangDTO createLangDTO(LangDTO LanguageDTO) {

			Language language = Language.builder()
					
					.languge_ID(LanguageDTO.getLanguge_ID())
					.languge_name(LanguageDTO.getLanguge_name())
					.languge_date(LanguageDTO.getLanguge_date())
					.languge_attach(LanguageDTO.getLanguge_attach())
					.languge_attach(LanguageDTO.getLanguge_attach())

					.build();

			Language saveLanguage = languageRepository.save(language);
			return LangMapper.domainToDto(saveLanguage);

		}

	}


