package br.com.henriquesousa.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountsList {
	protected List<Account> accountsList;
	
	public AccountsList() {
		this.accountsList = new ArrayList<>();
	}
	
	public void addAccount(Account newAccount) {
		this.accountsList.add(newAccount);
	}
}
