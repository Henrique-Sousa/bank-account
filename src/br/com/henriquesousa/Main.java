package br.com.henriquesousa;

import br.com.henriquesousa.BankAccount.Account;
import br.com.henriquesousa.BankAccount.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int option;
		Scanner input;
		List<Account> accountsList = new ArrayList<>();
		List<Account> savingsAccountsList = new ArrayList<>();
		
		do {
	        System.out.println(
		        "Menu" + "\n" +
		        "1. Create account" + "\n" +
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
	        		int option2 = input.nextInt();
	        		System.out.println("Type your name: ");
	        		String name = input.next();
	        		System.out.println("Type your ID: ");
	        		String ID = input.next();
	        		switch(option2) {
	        			case 1: 
	        				Account newAccount = new Account(name, ID); 
	        				System.out.println("Account created \n" + newAccount.toString());
	        				accountsList.add(newAccount);
	        				break;
	        			case 2: 
	        				Account newSavingsAccount = new SavingsAccount(name, ID); 
	        				System.out.println("Account created \n" + newSavingsAccount.toString());
	        				savingsAccountsList.add(newSavingsAccount);
	        				break;
	        		}
	        		break;
	        }
		} while(option != 0);
        input.close();

	}
}
