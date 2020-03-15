package com.Final.May.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
	
	   private String email;
	  
	   private String phoneNumber;
	  
	   private String address;
	  
	   private String password;



	public UserDTO(String email, String phoneNumber, String address, String password) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}


	public UserDTO() {
		super();
	}


}
