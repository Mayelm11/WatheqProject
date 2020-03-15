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
@Table(name = "Experience")
public class Experience implements Serializable {
                private static final long serialVersionUID = -3009157732242241606L;

               
                
                @ManyToOne(fetch=FetchType.LAZY,optional=false)
                @JoinColumn(name="NationalID",nullable=false)
                private Individual NationalID; 
                
                
                @ManyToOne(fetch=FetchType.LAZY,optional=false)
                @JoinColumn(name="Edu_iD",nullable=false)
                private Education Edu_iD; 
                
                @ManyToOne(fetch=FetchType.LAZY,optional=false)
                @JoinColumn(name="CR",nullable=false)
                private Company CR;
                
                @Id
          	  @Column(name = "Exp_id")
          	  @NotNull(message = " cannot be Empty ")
          	   private String Exp_id;

                
                @Column(name = "e_position", nullable=false)
                @NotNull(message = " cannot be Empty ")
                private String e_position;

                @Column(name = "name_company" , nullable=false)
                @NotNull(message = " cannot be Empty ")
                private String name_company;

                @Column(name = "s_date", nullable=false)
                @NotNull(message = " cannot be Empty ")
                private Timestamp s_date;

                @Column(name = "e_date")
                @NotNull(message = " cannot be Empty ")
                private Timestamp e_date;

                @Column(name = "add_by", nullable=false)
                @NotNull(message = " cannot be Empty ")
                private String add_by;
                
                @Column(name = "ref_name")
                @NotNull(message = " cannot be Empty ")
                private String ref_name;
                
                @Column(name = "ref_email")
                @NotNull(message = " cannot be Empty ")
                private String ref_email;

				public Individual getNationalID() {
					return NationalID;
				}

				public void setNationalID(Individual nationalID) {
					NationalID = nationalID;
				}

				public Education getEdu_iD() {
					return Edu_iD;
				}

				public void setEdu_iD(Education edu_iD) {
					Edu_iD = edu_iD;
				}

				public Company getCr() {
					return CR;
				}

				public void setCr(Company cr) {
					this.CR = cr;
				}

				public String getExp_id() {
					return Exp_id;
				}

				public void setExp_id(String exp_id) {
					Exp_id = exp_id;
				}

				public String getE_position() {
					return e_position;
				}

				public void setE_position(String e_position) {
					this.e_position = e_position;
				}

				public String getName_company() {
					return name_company;
				}

				public void setName_company(String name_company) {
					this.name_company = name_company;
				}

				public Timestamp getS_date() {
					return s_date;
				}

				public void setS_date(Timestamp s_date) {
					this.s_date = s_date;
				}

				public Timestamp getE_date() {
					return e_date;
				}

				public void setE_date(Timestamp e_date) {
					this.e_date = e_date;
				}

				public String getAdd_by() {
					return add_by;
				}

				public void setAdd_by(String add_by) {
					this.add_by = add_by;
				}

				public String getRef_name() {
					return ref_name;
				}

				public void setRef_name(String ref_name) {
					this.ref_name = ref_name;
				}

				public String getRef_email() {
					return ref_email;
				}

				public void setRef_email(String ref_email) {
					this.ref_email = ref_email;
				}
				@Builder
				public Experience(Individual nationalID, Education edu_iD, Company cr, String exp_id, String e_position,
						String name_company, Timestamp s_date, Timestamp e_date, String add_by, String ref_name,
						String ref_email) {
					super();
					NationalID = nationalID;
					Edu_iD = edu_iD;
					this.CR = cr;
					Exp_id = exp_id;
					this.e_position = e_position;
					this.name_company = name_company;
					this.s_date = s_date;
					this.e_date = e_date;
					this.add_by = add_by;
					this.ref_name = ref_name;
					this.ref_email = ref_email;
				}

				@Override
				public String toString() {
					return "Experience [NationalID=" + NationalID + ", Edu_iD=" + Edu_iD + ", cr=" + CR + ", Exp_id="
							+ Exp_id + ", e_position=" + e_position + ", name_company=" + name_company + ", s_date="
							+ s_date + ", e_date=" + e_date + ", add_by=" + add_by + ", ref_name=" + ref_name
							+ ", ref_email=" + ref_email + ", toString()=" + super.toString() + "]";
				}

				public Experience() {
					super();
				}

} 
