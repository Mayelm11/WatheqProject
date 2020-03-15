package com.Final.May.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ExpeDTO {
	private String Exp_id;

    
    private String e_position;

    private String name_company;

    private Timestamp s_date;

    private Timestamp e_date;

    private String add_by;
    
    private String ref_name;
    
    private String ref_email;


	public ExpeDTO(String exp_id, String e_position, String name_company, Timestamp s_date, Timestamp e_date,
			String add_by, String ref_name, String ref_email) {
		super();
		Exp_id = exp_id;
		this.e_position = e_position;
		this.name_company = name_company;
		this.s_date = s_date;
		this.e_date = e_date;
		this.add_by = add_by;
		this.ref_name = ref_name;
		this.ref_email = ref_email;
	}

	public ExpeDTO() {
		super();
	}

}
