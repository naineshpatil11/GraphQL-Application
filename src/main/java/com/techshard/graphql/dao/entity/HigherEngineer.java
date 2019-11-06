package com.techshard.graphql.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode
@Entity
public class HigherEngineer {

	@Id
	@Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "Name")
	String name;
	@Column(name = "Email")
	String email;
	@Column(name = "Collage_Name")
	String collageName;
	@Column(name = "Higher_Date")
	String higherDate;
	@Column(name = "hired_city")
	String higherCity;
	@Column(name = "mobile_number")
	String mobileNumber;
	@Column(name = "Degree")
	String degree;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getHigherDate() {
		return higherDate;
	}
	public void setHigherDate(String higherDate) {
		this.higherDate = higherDate;
	}
	public String getHigherCity() {
		return higherCity;
	}
	public void setHigherCity(String higherCity) {
		this.higherCity = higherCity;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "HigherEngineer [id=" + id + ", name=" + name + ", email=" + email + ", collageName=" + collageName
				+ ", higherDate=" + higherDate + ", higherCity=" + higherCity + ", mobileNumber=" + mobileNumber
				+ ", degree=" + degree + "]";
	}
}
