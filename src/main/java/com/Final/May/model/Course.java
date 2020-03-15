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

@Entity
@Table(name = "course")
public class Course implements Serializable {
  
   private static final long serialVersionUID = -3009157732242241606L;
   
   //user_id
   
   
   @ManyToOne(fetch=FetchType.LAZY,optional=false)
   @JoinColumn(name="NationalID",nullable=false)
   private Individual NationalID; 
    
   @ManyToOne(fetch=FetchType.LAZY,optional=false)
   @JoinColumn(name="CR",nullable=false)
   private Company CR;
   
   @ManyToOne(fetch=FetchType.LAZY,optional=false)
   @JoinColumn(name="Edu_iD",nullable=false)
	private Education Edu_iD;
   
   @Id
   @Column(name = "courseID", nullable = false)
   @NotNull(message = " cannot be Empty ")
    private String courseID;
   
   
   @Column(name = "nameCourse", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private String nameCourse;
   
   @Column(name = "addedBy", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private String addedBy;
   
   @Column(name = "nameInstittion", nullable = false)
   @NotNull(message = " cannot be Empty ")
   private String nameInstittion;
   
   @Column(name = "courseAttch")
   @NotNull(message = " cannot be Empty ")
   private String courseAttch;
  

 @Column(name = "startDate")
 @NotNull(message = " cannot be Empty ")
   private Timestamp startDate;
   
   @Column(name = "endDate")
   @NotNull(message = " cannot be Empty ")
   private Timestamp endDate;

public Individual getNationalID() {
	return NationalID;
}

public void setNationalID(Individual nationalID) {
	NationalID = nationalID;
}

public Company getCr() {
	return CR;
}

public void setCr(Company cr) {
	this.CR = cr;
}

public Education getEdu_iD() {
	return Edu_iD;
}

public void setEdu_iD(Education edu_iD) {
	Edu_iD = edu_iD;
}

public String getCourseID() {
	return courseID;
}

public void setCourseID(String courseID) {
	this.courseID = courseID;
}

public String getNameCourse() {
	return nameCourse;
}

public void setNameCourse(String nameCourse) {
	this.nameCourse = nameCourse;
}

public String getAddedBy() {
	return addedBy;
}

public void setAddedBy(String addedBy) {
	this.addedBy = addedBy;
}

public String getNameInstittion() {
	return nameInstittion;
}

public void setNameInstittion(String nameInstittion) {
	this.nameInstittion = nameInstittion;
}

public String getCourseAttch() {
	return courseAttch;
}

public void setCourseAttch(String courseAttch) {
	this.courseAttch = courseAttch;
}

public Timestamp getStartDate() {
	return startDate;
}

public void setStartDate(Timestamp startDate) {
	this.startDate = startDate;
}

public Timestamp getEndDate() {
	return endDate;
}

public void setEndDate(Timestamp endDate) {
	this.endDate = endDate;
}
@Builder
public Course(Individual nationalID, Company cr, Education edu_iD, String courseID, String nameCourse, String addedBy,
		String nameInstittion, String courseAttch, Timestamp startDate, Timestamp endDate) {
	super();
	NationalID = nationalID;
	this.CR = cr;
	Edu_iD = edu_iD;
	this.courseID = courseID;
	this.nameCourse = nameCourse;
	this.addedBy = addedBy;
	this.nameInstittion = nameInstittion;
	this.courseAttch = courseAttch;
	this.startDate = startDate;
	this.endDate = endDate;
}

@Override
public String toString() {
	return "Course [NationalID=" + NationalID + ", cr=" + CR + ", Edu_iD=" + Edu_iD + ", courseID=" + courseID
			+ ", nameCourse=" + nameCourse + ", addedBy=" + addedBy + ", nameInstittion=" + nameInstittion
			+ ", courseAttch=" + courseAttch + ", startDate=" + startDate + ", endDate=" + endDate + ", toString()="
			+ super.toString() + "]";
}

public Course() {
	super();
}


}