package com.Final.May.DTO;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class LangDTO {
	   private long id;

	   private String languge_ID;
	  
	   private String languge_name;
	 
	   private Timestamp languge_date;
	   
	   private String languge_attach;


	public LangDTO(long id, String languge_ID, String languge_name, Timestamp languge_date, String languge_attach) {
		super();
		this.id = id;
		this.languge_ID = languge_ID;
		this.languge_name = languge_name;
		this.languge_date = languge_date;
		this.languge_attach = languge_attach;
	}

	public LangDTO() {
		super();
	}



	
}