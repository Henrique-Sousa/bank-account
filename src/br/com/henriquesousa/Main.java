package br.com.henriquesousa;

import br.com.henriquesousa.BankAccount.Account;
import br.com.henriquesousa.BankAccount.SavingsAccount;
import br.com.henriquesousa.BankAccount.AccountsList;

import java.util.Scanner;

public class Main {
	//todo exceptions
	public static void main(String[] args){
		int option;
		Scanner input;
		AccountsList accountsList = new AccountsList();
		AccountsList savingsAccountsList = new AccountsList();
		
		do {
	        System.out.println(
		        "Menu" + "\n" +
		        "1. Create account" + "\n" +
		        "2. Delete account" + "\n" +
		        "9. teste" + "\n" +
		        "0. Exit" + "\n"
	        );
	        input = new Scanner(System.in);
	        option = input.nextInt();
	        switch(option) {
	        	case 1: 
	        		System.out.println(
	        				"What type of account you want to create?" + "\n" + 
	        				"1. Checking account" + "\n" + 
	        				"2. Savings account" + "\n"
	        		);
	        		int typeToCreate = input.nextInt();
	        		System.out.println("Type your name: ");
	        		String name = input.next();
	        		System.out.println("Type your ID: ");
	        		//todo: handle if there's two accounts with same id
	        		String IDToCreate = input.next();
	        		switch(typeToCreate) {
	        			case 1: 
	        				Account newAccount = new Account(name, IDToCreate); 
	        				System.out.println("Account created \n" + newAccount.toString());
	        				accountsList.addAccount(newAccount);
	        				break;
	        			case 2: 
	        				SavingsAccount newSavingsAccount = new SavingsAccount(name, IDToCreate); 
	        				System.out.println("Account created \n" + newSavingsAccount.toString());
	        				savingsAccountsList.addAccount(newSavingsAccount);
	        				break;
	        		}
	        		break;
	        	case 2:
	        		System.out.println(
	        				"What type of account you want to delete?" + "\n" + 
	        				"1. Checking account" + "\n" + 
	        				"2. Savings account" + "\n"
	        		);
	        		int typeToDelete = input.nextInt();
	        		AccountsList listToDelete = accountsList;
	        		switch(typeToDelete) {
	        			case 1: listToDelete = accountsList; break;
	        			case 2: listToDelete = savingsAccountsList; break;
	        		}
	        		System.out.println("What is your ID?");
	        		String IDToDelete = input.next();
	        		
	        		for(int i = 0; i < listToDelete.size(); i++) {
	        			if(listToDelete.get(i).getID().equals(IDToDelete)){
	        				listToDelete.remove(i);
	        				System.out.println("Account deleted: " + listToDelete.get(i).toString());
	        			}
	        			//todo: handle if there's no account with this id
	        		}
	        		break;
	        	case 9: 
	        		System.out.println("Accounts: " + "\n" + accountsList.toString() + "\n");
	        		System.out.println("Savings Accounts: " + "\n" + savingsAccountsList.toString() + "\n");	
	        }
		} while(option != 0);
        input.close();

	}
}
