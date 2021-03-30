package com.opennidus.training.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loc_id;
	
	private String door_no;
	private String area;
	private String landmark;
	private long postal_code;
	private String city;
	private String district;
	private String state;
	private String country;
	@Column(columnDefinition = "boolean default false")
	private boolean isdeletedflag;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "com_id", referencedColumnName = "id", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Company company;
	
	public Location() {
		super();
	}

	public Location(Company company, int loc_id, String door_no, String area, String landmark, long postal_code, String city, String district,
			String state, String country, boolean isdeletedflag) {
		super();
		this.loc_id= loc_id;
		this.company= company;
		this.door_no = door_no;
		this.area = area;
		this.landmark = landmark;
		this.postal_code = postal_code;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.isdeletedflag = isdeletedflag;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}


	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(long postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean getIsdeletedflag() {
		return isdeletedflag;
	}

	public void setIsdeletedflag(boolean isdeletedflag) {
		this.isdeletedflag = isdeletedflag;
	}
	
}
