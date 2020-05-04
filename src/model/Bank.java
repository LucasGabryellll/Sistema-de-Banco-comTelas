package model;

import java.util.ArrayList;

public class Bank {
	private static ArrayList<Account> accounts = new ArrayList<Account>();

	public static boolean addAccount(Account conta) {
		
		for (Account c : accounts) {
			if (c.getNumberAccount() == conta.getNumberAccount()) {
				
				return false;
			}
		}

		return accounts.add(conta);
	}

	public static boolean fetchAccount(int numberConta, String password) {
		
		for (Account c: accounts) {
			if (c.getNumberAccount() == numberConta && c.getPassword().equals(password))
				
				return true;
		}
		
		return false;
	}
	
	public static Account fetchAccount(int numberConta) {
		
		for (Account c: accounts) {
			if (c.getNumberAccount() == numberConta)
				
				return c;
		}
		
		return null;
	}
	
	public static boolean transfer(Account contaOrigem, Account contaDestino, double value) {
		
		if (contaOrigem.take(value) && contaDestino.deposit(value))
			
			return true;
		
		return false;
	}

}
