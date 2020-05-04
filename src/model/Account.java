package model;

import javax.swing.JOptionPane;

public abstract class Account {
	
	private int numberAccount;
	private String password;
	private double balance;
	
	public Account(int numberAccount, String password) {
		this.numberAccount = numberAccount;
		this.password = password;
	}
	
	public boolean take(double value) {
		if(value > 0 && value <= balance) {
			this.balance -= value;
			return true;
		}
		
		return false;
	}
	
	public boolean deposit(double value) {
		if(value > 0) {
			this.balance += value;
			return true;
		}
		
		return false;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getPassword() {
		return password;
	}
	
}
