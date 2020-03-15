package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.RecDTO;
import com.Final.May.ModelMapper.RecommendationMapperImp;
import com.Final.May.model.Recommendation;
import com.Final.May.repository.RecommendationRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
	@Service
	public class RecommendationService {
		private RecommendationRepository recommendationRepository;
		 private static final RecommendationMapperImp RecMapper = new RecommendationMapperImp();
		 public RecDTO createRecDTO(RecDTO  RecommendationDTO) {
		  
			 Recommendation recommendatio = Recommendation.builder()
		                 
		                .reco_id(RecommendationDTO.getReco_id())
		                .reco_From(RecommendationDTO.getReco_From())
		                .reco_Date(RecommendationDTO.getReco_Date())
		                .reco_AddBy(RecommendationDTO.getReco_AddBy())
		                .reco_Attach(RecommendationDTO.getReco_Attach())
		                .reco_Institute_Name(RecommendationDTO.getReco_Institute_Name())
		             

		                


		                .build();
			 Recommendation saveRecommendation = recommendationRepository.save(recommendatio);
		        return RecMapper.domainToDto(saveRecommendation);
		        
		    }

	}


