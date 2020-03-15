package com.Final.May.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Individual")
public class Individual extends W_User implements Serializable {
 
  private static final long serialVersionUID = -3009157732242241606L;
  
  @Id
  @Column(name = "NationalID",unique=true, nullable = false)
  @NotNull(message = " cannot be Empty ")
  //@Size(min=10, max=10)
  private String NationalID;
  
  
  @Column(name = "Firstname", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Firstname;
  
  @Column(name = "MName", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String MName;
 
  @Column(name = "Lastname", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Lastname;
  
 
  @Column(name = "Gender", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Boolean Gender;
  
  @Column(name = "Status")
  @NotNull(message = " cannot be Empty ")
  private String Status;
  
  @Column(name = "Skills")
  @NotNull(message = " cannot be Empty ")
  private String Skills;
  
  
  @Column(name = "DOB", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Timestamp DOB;
  
  @Column(name = "MAJOR",  nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String MAJOR;
  
  @Column(name = "Attachments",  nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Attachments;
  

  
  @Column(name = "JOP",  nullable = false)
  private String JOP;




@Override
public String toString() {
	return "Individual [NationalID=" + NationalID + ", Firstname=" + Firstname + ", MName=" + MName + ", Lastname="
			+ Lastname + ", Gender=" + Gender + ", Status=" + Status + ", Skills=" + Skills + ", DOB=" + DOB
			+ ", MAJOR=" + MAJOR + ", Attachments=" + Attachments + ", JOP=" + JOP + ", toString()=" + super.toString()
			+ "]";
}



public Individual() {
	super();
}


@Builder
public Individual(String email, String phone_number, String address, String password, String NationalID,
		String Firstname, String MName, String Lastname, Boolean Gender, String Status, String Skills, Timestamp DOB,
		String MAJOR, String Attachments, String JOP) {
	super(email, phone_number, address, password);
	this.NationalID = NationalID;
	this.Firstname = Firstname;
	this.MName = MName;
	this.Lastname = Lastname;
	this.Gender = Gender;
	this.Status = Status;
	this.Skills = Skills;
	this.DOB = DOB;
	this.MAJOR = MAJOR;
	this.Attachments = Attachments;
	this.JOP = JOP;
}



public Individual(@NotNull(message = " cannot be Empty ") @Size(min = 10, max = 10) String NationalID) {
	super();
	this.NationalID = NationalID;
}






  
}