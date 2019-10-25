package com.janani.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application_data")
public class ApplyLoan {
	private static final long SerialVersionUID=1L;
	
	@Id
	@Column
	private int loanid;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	@Column(name="userid")
	private int userId;
	@Column(name="name")
	private String name;
	@Column(name="loanAmount")
	private int loanAmount;
	@Column
	private String propertyType;
	@Column
	private float propertyAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public float getPropertyAmount() {
		return propertyAmount;
	}
	public void setPropertyAmount(float propertyAmount) {
		this.propertyAmount = propertyAmount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
