package com.Final.May.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CompDTO  extends UserDTO {
	   private String CR;
	   private String CompanyName;
	   private Timestamp StartDate;
	   private Timestamp EndDate;

	   

	public CompDTO(String email, String phoneNumber, String address, String password, String CR, String CompanyName,
			Timestamp StartDate, Timestamp EndDate) {
		super(email, phoneNumber, address, password);
		this.CR = CR;
		this.CompanyName = CompanyName;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public CompDTO() {
		super();
		
	}
}
	   
	