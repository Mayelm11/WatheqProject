package com.Final.May.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EduDTO  extends UserDTO {
	
	  private String Edu_iD;
	  private String EDU_NAME;

	public EduDTO(String email, String phoneNumber, String address, String password, String edu_iD, String eDU_NAME) {
		super(email, phoneNumber, address, password);
		this.Edu_iD = edu_iD;
		this.EDU_NAME = eDU_NAME;
	}
	public EduDTO() {
		super();
	}
	


}
