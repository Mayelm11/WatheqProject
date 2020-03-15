package com.Final.May.repository;


import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Final.May.model.Certification;

@Transactional 
@Repository
public interface CertificationRepository extends CrudRepository<Certification, String>{
	

	@Modifying
	 @Query("UPDATE Certification certification SET certification.UNI_NAME = :UNI_NAME WHERE certification.CERT_id =:CERT_id")
	 void updateUNI_NAME(@Param("CERT_id") String CERT_id, @Param("UNI_NAME") String UNI_NAME);

	@Modifying
	 @Query("UPDATE Certification certification SET certification.ADDBY = :ADDBY WHERE certification.CERT_id =:CERT_id")
	 void updateADDBY(@Param("CERT_id") String CERT_id, @Param("ADDBY") String ADDBY);

	@Modifying
	 @Query("UPDATE Certification certification SET certification.CERT_DATE = :CERT_DATE WHERE certification.CERT_id =:CERT_id")
	 void updateCERT_DATE(@Param("CERT_id") Timestamp CERT_id, @Param("CERT_DATE") Timestamp CERT_DATE);
	
	@Modifying
	 @Query("UPDATE Certification certification SET certification.GPA = :GPA WHERE certification.CERT_id =:CERT_id")
	 void updateGPA(@Param("CERT_id") String CERT_id, @Param("GPA") String GPA);
	
	@Modifying
	 @Query("UPDATE Certification certification SET certification.DEGREE = :DEGREE WHERE certification.CERT_id =:CERT_id")
	 void updateDEGREE(@Param("CERT_id") String CERT_id, @Param("DEGREE") double DEGREE);
	
	@Modifying
	 @Query("UPDATE Certification certification SET certification.MAJOR = :MAJOR WHERE certification.CERT_id =:CERT_id")
	 void updateMAJOR(@Param("CERT_id") String CERT_id, @Param("MAJOR") String MAJOR);
	
	@Modifying
	 @Query("UPDATE Certification certification SET certification.ATTACH = :ATTACH WHERE certification.CERT_id =:CERT_id")
	 void updateATTACH(@Param("CERT_id") String CERT_id, @Param("ATTACH") String aTTACH);
	
}
