package com.Final.May.DTO;

	import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

	@Setter
	@Getter
	public class IndivDTO extends UserDTO {
		  private String NationalID;
		  
		  private String FirstName;
		  
		  private String MName;

		  private String LastName;
		  
		  private Boolean Gender;
		  
		  private String Status;
		  
		  private String Skills;
		  
		  private Timestamp DOB;
		  
		  private String MAJOR;
		  
		  private String Attachments;
		  
		  private String JOP;
		  
		  

		public IndivDTO( String email, String phoneNumber, String address, String password,
				String NationalID, String FirstName, String MName, String LastName, Boolean Gender, String Status,
				String Skills, Timestamp DOB, String MAJOR, String Attachments, String JOP) {
			super( email, phoneNumber, address, password);
			this.NationalID = NationalID;
			this.FirstName = FirstName;
			this.MName = MName;
			this.LastName = LastName;
			this.Gender = Gender;
			this.Status = Status;
			this.Skills = Skills;
			this.DOB = DOB;
			this.MAJOR = MAJOR;
			this.Attachments = Attachments;
			this.JOP = JOP;
		}

		public IndivDTO() {
			super();
		}

		
		
	}



