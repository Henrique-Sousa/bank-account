package br.com.henriquesousa.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccountsList {
	protected List<Account> savingsAccountsList;

	public SavingsAccountsList() {
		this.savingsAccountsList = new ArrayList<>();
	}
	
	public void addSavingsAccount(SavingsAccount newSavingsAccount) {
		this.savingsAccountsList.add(newSavingsAccount);
	}
}
