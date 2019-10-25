package com.janani.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Account")
public class Account implements Serializable {
	
	
	@Id
	@Column
	private int accountnum;
	@Column
	private double amount;
	@Column
	private char accounttype;
	@Column
	private int userid;
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public char getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Account [accountnum=" + accountnum + ", amount=" + amount + ", accounttype=" + accounttype + ", userid="
				+ userid + "]";
	}
//	public Account() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Account(int accountnum, double amount, char accounttype, int userid) {
//		super();
//		this.accountnum = accountnum;
//		this.amount = amount;
//		this.accounttype = accounttype;
//		this.userid = userid;
	}
	
	
	




	