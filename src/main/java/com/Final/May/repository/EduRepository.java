package com.Final.May.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Final.May.model.Education;

@Repository
@Transactional 


	public interface EduRepository extends CrudRepository<Education, String>{
	
	@Modifying
	 @Query("UPDATE Education education SET education.EDU_NAME = :EDU_NAME WHERE education.Edu_iD = :Edu_iD")
	 void updateEDU_NAME(@Param("Edu_iD") String Edu_iD, @Param("EDU_NAME") String EDU_NAME);

	  
    @Modifying
    @Query("UPDATE Education education SET education.email = :email WHERE education.Edu_iD = :Edu_iD")
    void updateEmail(@Param("Edu_iD") String Edu_iD, @Param("email") String email);

    @Modifying
    @Query("UPDATE Education education SET education.phoneNumber = :phoneNumber WHERE education.Edu_iD = :Edu_iD")
    void updatephoneNumber(@Param("Edu_iD") String Edu_iD, @Param("phoneNumber") String phoneNumber);

    @Modifying
    @Query("UPDATE Education education SET education.address = :address WHERE education.Edu_iD = :Edu_iD")
    void updateaddress(@Param("Edu_iD") String Edu_iD, @Param("address") String address);
    

    @Modifying
    @Query("UPDATE Education education SET education.password = :password WHERE education.Edu_iD = :Edu_iD")
    void updatePassword(@Param("Edu_iD") String Edu_iD, @Param("password") String Password);
  

	}


