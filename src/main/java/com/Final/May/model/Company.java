package com.Final.May.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;

@Entity
@Table(name = "Company")
public class Company extends W_User implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "CR", unique = true)
	@NotNull(message = " cannot be Empty ")
	// @Min(value = 10, message = "CR should not be less than 18")
	// @Max(value = 10, message = "CR should not be greater than 150")
	private String CR;

	// Name of company
	@Column(name = "CompanyName", nullable = false)
	@NotNull(message = " cannot be Empty ")
	private String CompanyName;

	// cr starting Date
	@Column(name = "StartDate", nullable = false)
	@NotNull(message = " cannot be Empty ")
	private Timestamp StartDate;

	@Column(name = "EndDate", nullable = false)
	@NotNull(message = " cannot be Empty ")
	private Timestamp EndDate;

	public String getCompanyname() {
		return CompanyName;
	}

	public void setCompanyname(String CompanyName) {
		this.CompanyName = CompanyName;

	}

	public String getCR() {
		return CR;
	}

	public void setCR(String CR) {
		this.CR = CR;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public Timestamp getStartDate() {
		return StartDate;
	}

	public void setStartDate(Timestamp startDate) {
		StartDate = startDate;
	}

	public Timestamp getEndDate() {
		return EndDate;
	}

	public void setEndDate(Timestamp endDate) {
		EndDate = endDate;
	}

	@Override
	public String toString() {
		return "Company [CR=" + CR + ", CompanyName=" + CompanyName + ", StartDate=" + StartDate + ", EndDate="
				+ EndDate + ", toString()=" + super.toString() + "]";
	}

	@Builder

	public Company(String email, String phone_number, String address, String password, String CR, String CompanyName,
			Timestamp StartDate, Timestamp EndDate) {
		super(email, phone_number, address, password);
		this.CR = CR;
		this.CompanyName = CompanyName;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public Company() {
		super();
	}

}
