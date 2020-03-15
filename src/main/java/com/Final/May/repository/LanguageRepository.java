package com.Final.May.repository;


import java.sql.Timestamp;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Final.May.model.Language;

@Transactional 
@Repository
public interface LanguageRepository extends CrudRepository<Language, String>{

	
	@Modifying
	 @Query("UPDATE Language language SET language.languge_name = :languge_name WHERE language.languge_ID = :languge_ID")
	 void updatelanguge_name(@Param("languge_ID") String languge_ID, @Param("languge_name") String languge_name);
	
	@Modifying
	 @Query("UPDATE Language language SET language.languge_date = :languge_date WHERE language.languge_ID = :languge_ID")
	 void updatelanguge_date(@Param("languge_ID") String languge_ID, @Param("languge_date") Timestamp languge_date);
	
	@Modifying
	 @Query("UPDATE Language language SET language.languge_attach = :languge_attach WHERE language.languge_ID = :languge_ID")
	 void updatelanguge_attach(@Param("languge_ID") String languge_ID, @Param("languge_attach") String languge_attach);
}
