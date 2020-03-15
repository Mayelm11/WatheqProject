package com.Final.May.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CouDTO {
	 private String courseID;
	   
	   
	   private String nameCourse;
	   
	   private String addedBy;
	   
	   private String nameInstittion;
	   
	   private String courseAttch;

	   private Timestamp startDate;
	   
	   private Timestamp endDate;
	   
	

	public CouDTO(String courseID, String nameCourse, String addedBy, String nameInstittion, String courseAttch,
			Timestamp startDate, Timestamp endDate) {
		super();
		this.courseID = courseID;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.nameInstittion = nameInstittion;
		this.courseAttch = courseAttch;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public CouDTO() {
		super();
	}

}
