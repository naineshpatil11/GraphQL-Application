package com.techshard.graphql.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankDetails {

	@Id
	@Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "Name")
	String name;
	@Column(name = "Account_Number")
	String accountNumber;
	@Column(name = "IFSC")
	String ifscCode;
	@Column(name = "Pan_Number")
	String panNumber;
	@Column(name = "Addhar_Number")
	String addharNumber;
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
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(String addharNumber) {
		this.addharNumber = addharNumber;
	}
	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", panNumber=" + panNumber + ", addharNumber=" + addharNumber + "]";
	}
	 
}
