package com.Final.May.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "Recommendation")
public class Recommendation implements Serializable {
 
  private static final long serialVersionUID = -3009157732242241606L;
  
  //Recommendation ID
  
  @Id
  @Column(name = "reco_id")
  @NotNull(message = " cannot be Empty ")
  private String reco_id;
    
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="NationalID",unique=true,nullable=false)
  private Individual NationalID;
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="Edu_iD",nullable=false)
  private Education Edu_iD; 
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="CR",nullable=false)
  private Company CR; 
  
  //Person who write it
  @Column(name = "Reco_From", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_From;
  
  //Recommendation Creation date
  @Column(name = "Reco_Date", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Timestamp Reco_Date;
  
  //User Who added Recommendation 
  @Column(name = "Reco_AddBy", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_AddBy;
  
  //URL Recommendation attachment
  @Column(name = "Reco_Attach", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_Attach;
  
  //The name of the institute Who added Recommendation 
  @Column(name = "Reco_Institute_Name", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_Institute_Name;

@Builder
public Recommendation(String reco_id, Education edu_iD, Company cr, String reco_From, Timestamp reco_Date,
		String reco_AddBy, String reco_Attach, String reco_Institute_Name) {
	super();
	this.reco_id = reco_id;
	Edu_iD = edu_iD;
	this.CR = cr;
	Reco_From = reco_From;
	Reco_Date = reco_Date;
	Reco_AddBy = reco_AddBy;
	Reco_Attach = reco_Attach;
	Reco_Institute_Name = reco_Institute_Name;
}

@Override
public String toString() {
	return "Recommendation [reco_id=" + reco_id + ", Edu_iD=" + Edu_iD + ", cr=" + CR + ", Reco_From=" + Reco_From
			+ ", Reco_Date=" + Reco_Date + ", Reco_AddBy=" + Reco_AddBy + ", Reco_Attach=" + Reco_Attach
			+ ", Reco_Institute_Name=" + Reco_Institute_Name + ", toString()=" + super.toString() + "]";
}

public Recommendation() {
	super();
}



}