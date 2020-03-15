package com.Final.May.repository;



import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Final.May.model.Recommendation;

@Transactional 
@Repository
public interface RecommendationRepository extends CrudRepository<Recommendation, String>{

	@Modifying
	 @Query("UPDATE Recommendation recommendation SET recommendation.Reco_From = :Reco_From WHERE recommendation.reco_id = :reco_id")
	 void updateReco_From(@Param("reco_id") String reco_id, @Param("Reco_From") String Reco_From);
	
	@Modifying
	 @Query("UPDATE Recommendation recommendation SET recommendation.Reco_Date = :Reco_Date WHERE recommendation.reco_id = :reco_id")
	 void updateReco_Date(@Param("reco_id") String reco_id, @Param("Reco_Date") Timestamp Reco_Date);
	
	@Modifying
	 @Query("UPDATE Recommendation recommendation SET recommendation.Reco_Attach = :Reco_Attach WHERE recommendation.reco_id = :reco_id")
	 void updateReco_Attach(@Param("reco_id") String reco_id, @Param("Reco_Attach") String Reco_Attach);
	
	@Modifying
	 @Query("UPDATE Recommendation recommendation SET recommendation.Reco_Institute_Name = :Reco_Institute_Name WHERE recommendation.reco_id = :reco_id")
	 void updateReco_Institute_Name(@Param("reco_id") String reco_id, @Param("Reco_Institute_Name") String Reco_Institute_Name);
}
