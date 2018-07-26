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
	public int size() {
		return this.accountsList.size();
	}
	public Account get(int i) {
		return this.accountsList.get(i);
	}
	public void remove(int i) {
		this.accountsList.remove(i);
	}
	public String toString() {
		return this.accountsList.toString();
	}
}