package com.opennidus.training.Entity;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "subscriber_details")
public class Subscriber {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sub_id;
	
	@Column(nullable = false)
	private String sub_name;
	
	@Column(nullable = false)
	private String sub_email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String company_name;
	
	@Column(nullable = false)
	private String comp_Website;
	
	@Column(columnDefinition = "boolean default false")
	private boolean status;
	
	@Column(columnDefinition = "boolean default false")
	private boolean isdeletedflag;
	
	private LocalDate created_date = LocalDate.now();

	 
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "subscriber")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Company company;
	
	
	public Subscriber() {
		super();
	}

	public Subscriber(String sub_name, String sub_email, String password, String company_name, String comp_Website,
			boolean status, boolean isdeletedflag, LocalDate created_date) {
		super();
		this.sub_name = sub_name;
		this.sub_email = sub_email;
		this.password = password;
		this.company_name = company_name;
		this.comp_Website = comp_Website;
		this.status = status;
		this.isdeletedflag = isdeletedflag;
		this.created_date = created_date;
		//this.company = company;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getSub_email() {
		return sub_email;
	}

	public void setSub_email(String sub_email) {
		this.sub_email = sub_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getComp_Website() {
		return comp_Website;
	}

	public void setComp_Website(String comp_Website) {
		this.comp_Website = comp_Website;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isIsdeletedflag() {
		return isdeletedflag;
	}

	public void setIsdeletedflag(boolean isdeletedflag) {
		this.isdeletedflag = isdeletedflag;
	}

	public LocalDate getcreated_date() {
		return created_date;
	}

	public void setcreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}
//	public Company getCompany() {
//		return company;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}

}
