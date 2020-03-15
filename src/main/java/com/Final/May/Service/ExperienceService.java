package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.ExpeDTO;
import com.Final.May.ModelMapper.ExperienceMapperImp;
import com.Final.May.model.Experience;
import com.Final.May.repository.ExperienceRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
	@Service
	public class ExperienceService {
		private ExperienceRepository experienceRepository;
		 private static final ExperienceMapperImp ExpMapper = new ExperienceMapperImp();
		 public ExpeDTO createExpeDTO(ExpeDTO ExperienceDTO) {
		  
			 Experience experience = Experience.builder()
		                 
		                .exp_id(ExperienceDTO.getExp_id())
		                .e_position(ExperienceDTO.getE_position())
		                .name_company(ExperienceDTO.getName_company())
		                .s_date(ExperienceDTO.getS_date())
		                .e_date(ExperienceDTO.getE_date())
		                .add_by(ExperienceDTO.getAdd_by())
		                .ref_name(ExperienceDTO.getRef_name())
		                .ref_email(ExperienceDTO.getRef_email())

		                


		                .build();
			 Experience saveExperience = experienceRepository.save(experience);
		        return ExpMapper.domainToDto(saveExperience);
		        
		    }

	}


