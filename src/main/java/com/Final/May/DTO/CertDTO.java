package com.Final.May.DTO;

import java.sql.Timestamp;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertDTO {
		 private String CERT_id ;
	  
	  private String UNI_NAME;
	 
	  
	  private String ADDBY; 
	  
	 private Timestamp CERT_DATE;
	  
		 private double GPA ;
	  
		 private String DEGREE;
	  
		 private String MAJOR;
	  
		 private String ATTACH;

	

		public CertDTO(String cERT_id, String uNI_NAME, String aDDBY, Timestamp cERT_DATE, double gPA, String dEGREE,
				String mAJOR, String aTTACH) {
			super();
			this.CERT_id = cERT_id;
			this.UNI_NAME = uNI_NAME;
			this.ADDBY = aDDBY;
			this.CERT_DATE = cERT_DATE;
			this.GPA = gPA;
			this.DEGREE = dEGREE;
			this.MAJOR = mAJOR;
			this.ATTACH = aTTACH;
		}

		public CertDTO() {
			super();
		}


}