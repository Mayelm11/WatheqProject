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
	@Table(name = "Certification")
	public class Certification implements Serializable {

	  private static final long serialVersionUID = -3009157732242241606L;
	
	  @Id
	  @Column(name = "CERT_id")
	  @NotNull(message = " cannot be Empty ")
	private String CERT_id; 
	  
	  
	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false)
      @JoinColumn(name="NationalID", referencedColumnName = "NationalID",unique=true,nullable=false)
      private Individual NationalID; 
	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false)
	  @JoinColumn(name="Edu_iD",nullable=false)
	  private Education Edu_iD; 
	  
	  @Column(name = "UNI_NAME", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	  private String UNI_NAME;
	 
	  
	  @Column(name = "ADDBY", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	  private String ADDBY; 
	  
	  @Column(name = "CERT_DATE", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	 private Timestamp CERT_DATE;
	  
	  @Column(name = "GPA", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private double GPA ;
	  
	  @Column(name = "DEGREE", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private String DEGREE;
	  
	  @Column(name = "MAJOR")
	  @NotNull(message = " cannot be Empty ")
		 private String MAJOR;
	  
	  @Column(name = "ATTACH", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private String ATTACH;


	@Override
	public String toString() {
		return "Certification [NationalID=" + NationalID + ", Edu_iD=" + Edu_iD + ", CERT_id=" + CERT_id + ", UNI_NAME="
				+ UNI_NAME + ", ADDBY=" + ADDBY + ", CERT_DATE=" + CERT_DATE + ", GPA=" + GPA + ", DEGREE=" + DEGREE
				+ ", MAJOR=" + MAJOR + ", ATTACH=" + ATTACH + ", toString()=" + super.toString() + "]";
	}
@Builder
	public Certification(String nationalID, String edu_iD, String cERT_id, String uNI_NAME, String aDDBY,
			Timestamp cERT_DATE, double gPA, String dEGREE, String mAJOR, String aTTACH) {
		super();
		NationalID = new Individual (nationalID);
		Edu_iD = new Education (edu_iD);
		CERT_id = cERT_id;
		UNI_NAME = uNI_NAME;
		ADDBY = aDDBY;
		CERT_DATE = cERT_DATE;
		GPA = gPA;
		DEGREE = dEGREE;
		MAJOR = mAJOR;
		ATTACH = aTTACH;
	}

public Certification() {
	super();
}

	
	  
	}