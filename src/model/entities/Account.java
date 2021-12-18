package model.entities;

import model.excepitions.UnacceptableValue;

public class Account {
	
	private Integer number;
	private String holderString;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holderString, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holderString = holderString;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolderString() {
		return holderString;
	}

	public void setHolderString(String holderString) {
		this.holderString = holderString;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double value) {
		balance += value;
	}
	
	public void withdraw(Double value) throws UnacceptableValue {
		if (value > withdrawLimit) {
			throw new UnacceptableValue("Withdraw error: The amount exceeds withdraw limit");
		}
		if (balance < value) {
			throw new UnacceptableValue("Withdraw error: Not enough balance");
		}
		balance -= value;
	}

	
}
