package com.Final.May.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class RecDTO {
	  private String reco_id ;
	  private String Reco_From;
	  
	  private Timestamp Reco_Date;
	  
	  private String Reco_AddBy;
	  
	  private String Reco_Attach;
	  
	  private String Reco_Institute_Name;

	
	public RecDTO(String reco_id, String reco_From, Timestamp reco_Date, String reco_AddBy, String reco_Attach,
			String reco_Institute_Name) {
		super();
		this.reco_id = reco_id;
		this.Reco_From = reco_From;
		this.Reco_Date = reco_Date;
		this.Reco_AddBy = reco_AddBy;
		this.Reco_Attach = reco_Attach;
		this.Reco_Institute_Name = reco_Institute_Name;
	}

	public RecDTO() {
		super();
	}
	  
	 
	


}
