package com.Final.May.model;
import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "language")
public class Language implements Serializable {
 private static final long serialVersionUID = -3009157732242241606L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="NationalID",nullable=false)
  private Individual NationalID; 
 
  @Column(name = "languge_ID",  nullable = false)
  @NotNull(message = " cannot be Empty ")
	  @Min(value = 10, message = "Nationa should not be less than 18")
	  @Max(value = 10, message = "Nationa should not be greater than 150")
  private String languge_ID;
  
 
   @Column(name = "languge_name", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private String languge_name;
  
   
   @Column(name = "languge_date", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private Timestamp languge_date;
   
   
   
  // @Column(name = "duration_valid")
   //private String duration_valid;
   
   @Column(name = "languge_attach", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private String languge_attach;




@Override
public String toString() {
	return "Language [id=" + id + ", languge_ID=" + languge_ID + ", NationalID=" + NationalID + ", languge_name="
			+ languge_name + ", languge_date=" + languge_date + ", languge_attach=" + languge_attach + ", toString()="
			+ super.toString() + "]";
}


@Builder
public Language(long id, String languge_ID, Individual nationalID, String languge_name, Timestamp languge_date,
		String languge_attach) {
	super();
	this.id = id;
	this.languge_ID = languge_ID;
	NationalID = nationalID;
	this.languge_name = languge_name;
	this.languge_date = languge_date;
	this.languge_attach = languge_attach;
}



public Language() {
	super();
}
   
   
}