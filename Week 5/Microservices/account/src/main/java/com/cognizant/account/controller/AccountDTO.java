package com.cognizant.account.controller;

public class AccountDTO {
	private String number="00987987973432";
	private String type="savings";
	private String balance= "234343";
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
}
