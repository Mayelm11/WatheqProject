package com.Final.May.repository;

import java.sql.Timestamp;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Final.May.model.Individual;
		 
	@Transactional 
	@Repository
	public interface IndividualRepository extends CrudRepository<Individual,String> {
	
		@Modifying
		 @Query("UPDATE Individual individual SET individual.Firstname = :Firstname WHERE individual.NationalID = :NationalID")
		 void updateFirstname(@Param("NationalID") String NationalID, @Param("Firstname") String Firstname);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.MName = :MName WHERE individual.NationalID = :NationalID")
		 void updateMName(@Param("NationalID") String NationalID, @Param("MName") String MName);

		@Modifying
		 @Query("UPDATE Individual individual SET individual.Lastname = :Lastname WHERE individual.NationalID = :NationalID")
		 void updateLastname(@Param("NationalID") String NationalID, @Param("Lastname") String Lastname);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.Status = :Status WHERE individual.NationalID = :NationalID")
		 void updateStatus(@Param("NationalID") String NationalID, @Param("Status") String Status);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.Skills = :Skills WHERE individual.NationalID = :NationalID")
		 void updateSkills(@Param("NationalID") String NationalID, @Param("Skills") String Skills);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.DOB = :DOB WHERE individual.NationalID = :NationalID")
		 void updateDOB(@Param("NationalID") String NationalID, @Param("DOB") Timestamp DOB);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.MAJOR = :MAJOR WHERE individual.NationalID = :NationalID")
		 void updateMAJOR(@Param("NationalID") String NationalID, @Param("MAJOR") String MAJOR);
		
		@Modifying
		 @Query("UPDATE Individual individual SET individual.Attachments = :Attachments WHERE individual.NationalID = :NationalID")
		 void updateAttachments(@Param("NationalID") String NationalID, @Param("Attachments") String Attachments);
	
		@Modifying
		 @Query("UPDATE Individual individual SET individual.JOP = :JOP WHERE individual.NationalID = :NationalID")
		 void updateJOP(@Param("NationalID") String NationalID, @Param("JOP") String JOP);
	
		
		   @Modifying
		    @Query("UPDATE Individual individual SET individual.email = :email WHERE individual.NationalID = :NationalID")
		    void updateEmail(@Param("NationalID") String NationalID, @Param("email") String email);

		   @Modifying
		    @Query("UPDATE Individual individual SET individual.address = :address WHERE individual.NationalID = :NationalID")
		    void updateaddress(@Param("NationalID") String NationalID, @Param("address") String address);
		   
		   @Modifying
		    @Query("UPDATE Individual individual SET individual.phoneNumber = :phoneNumber WHERE individual.NationalID = :NationalID")
		    void updatephoneNumber(@Param("NationalID") String NationalID, @Param("phoneNumber") String phoneNumber);
		   
		   @Modifying
		    @Query("UPDATE Individual individual SET individual.password = :password WHERE individual.NationalID = :NationalID")
		    void updatepassword(@Param("NationalID") String NationalID, @Param("password") String password);


	}
	
