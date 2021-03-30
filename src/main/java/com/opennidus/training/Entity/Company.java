package com.opennidus.training.Entity;

import java.time.LocalDate;
//import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "Companydata")
public class Company {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String company_name;
	@Column(nullable = false)
	private String business_type;
	@Column(nullable = false)
	private String nature_of_business;
	@Column(nullable = false)
	private String website;
	@Column(nullable = false)
	private String person_name;
	@Column(nullable = false)
	private long contact_number;
	@Column(nullable = false)
	private long whatsapp_number;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date financial_from;
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date financial_to;
	@Column(nullable = false)
	private String currency_type;
	@Column(nullable = false)
	private int currency_decimal;
	@Column(nullable = false)
	private LocalDate business_starts_on = LocalDate.now();
	@Column(columnDefinition = "boolean default false")
	private boolean status;
	@Column(columnDefinition = "boolean default false")
	private boolean isdeletedflag;


	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_id", referencedColumnName = "sub_id", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Subscriber subscriber;

		@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "company")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Location location;

	public Company(int id, String company_name, String business_type, String nature_of_business, String website,
			String person_name, long contact_number, long whatsapp_number, String email, Date financial_from,
			Date financial_to, String currency_type, int currency_decimal, LocalDate business_starts_on, boolean status, boolean isdeletedflag
			,Subscriber subscriber) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.business_type = business_type;
		this.nature_of_business = nature_of_business;
		this.website = website;
		this.person_name = person_name;
		this.contact_number = contact_number;
		this.whatsapp_number = whatsapp_number;
		this.email = email;
		this.financial_from = financial_from;
		this.financial_to = financial_to;
		this.currency_type = currency_type;
		this.currency_decimal = currency_decimal;
		this.business_starts_on = business_starts_on;
		this.status = status;
		this.isdeletedflag = isdeletedflag;
		this.subscriber = subscriber;
		//this.location = location;
	}

	public Company() {
		super();
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getcompany_name() {
		return company_name;
	}
	public void setcompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getbusiness_type() {
		return business_type;
	}
	public void setbusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getnature_of_business() {
		return nature_of_business;
	}
	public void setnature_of_business(String nature_of_business) {
		this.nature_of_business = nature_of_business;
	}
	public String getwebsite() {
		return website;
	}
	public void setwebsite(String website) {
		this.website = website;
	}
	public String getperson_name() {
		return person_name;
	}
	public void setperson_name(String person_name) {
		this.person_name = person_name;
	}
	public long getcontact_number() {
		return contact_number;
	}
	public void setcontact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public long getwhatsapp_number() {
		return whatsapp_number;
	}
	public void setwhatsapp_number(long whatsapp_number) {
		this.whatsapp_number = whatsapp_number;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public Date getfinancial_from() {
		return financial_from;
	}
	public void setfinancial_from(Date financial_from) {
		this.financial_from = financial_from;
	}
	public Date getfinancial_to() {
		return financial_to;
	}
	public void setfinancial_to(Date financial_to) {
		this.financial_to = financial_to;
	}
	public String getcurrency_type() {
		return currency_type;
	}
	public void setcurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}
	public int getcurrency_decimal() {
		return currency_decimal;
	}
	public void setcurrency_decimal(int currency_decimal) {
		this.currency_decimal = currency_decimal;
	}
	public LocalDate getbusiness_starts_on() {
		return business_starts_on;
	}
	public void setbusiness_starts_on(LocalDate business_starts_on) {
		this.business_starts_on = business_starts_on;
	}
	public boolean getstatus() {
		return status;
	}
	public void setstatus(boolean status) {
		this.status = status;
	}

	public boolean getIsdeletedflag() {
		return isdeletedflag;
	}

	public void setIsdeletedflag(boolean isdeletedflag) {
		this.isdeletedflag = isdeletedflag;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
//	public Location getLocation() {
//		return location;
//	}
//
//	public void setSLocation(Location location) {
//		this.location = location;
//	}


}


