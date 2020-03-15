package com.Final.May.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
	@Entity
	@Table(name = "Education")
	public class  Education extends W_User implements Serializable {

	  private static final long serialVersionUID = -3009157732242241606L;

	  @Id
	  @Column(name = "Edu_iD",unique=true,  nullable = false)
	  @Min(value = 10, message = "Nationa should not be less than 18")
  	  @Max(value = 10, message = "Nationa should not be greater than 150")
	  @NotNull(message = " cannot be Empty ")
	  private String Edu_iD;
	  
	 
	  @Column(name = "EDU_NAME",  nullable = false)
	  @NotNull(message = " cannot be Empty ")
	  private String EDU_NAME;


	@Override
	public String toString() {
		return "Education [Edu_iD=" + Edu_iD + ", EDU_NAME=" + EDU_NAME + ", toString()=" + super.toString() + "]";
	}
	@Builder


	public Education(String email, String phone_number, String address, String password, String edu_iD,
			String eDU_NAME) {
		super(email, phone_number, address, password);
		Edu_iD = edu_iD;
		EDU_NAME = eDU_NAME;
	}


	public Education() {
		super();
	}
	public Education(
			@Min(value = 10, message = "Nationa should not be less than 18") @Max(value = 10, message = "Nationa should not be greater than 150") @NotNull(message = " cannot be Empty ") String edu_iD) {
		super();
		Edu_iD = edu_iD;
	}



	}