package br.com.henriquesousa;

import br.com.henriquesousa.BankAccount.Account;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int option;
		
		do {
	        System.out.println(
	        "Menu" + "\n" +
	        "1. Create account" + "\n" +
	        "0. Exit" + "\n"
	        );
	        Scanner input = new Scanner(System.in);
	        option = input.nextInt();
	        switch(option) {
	        	case 1: 
	        		System.out.println("Type your name: ");
	        		String name = input.next();
	        		System.out.println("Type your ID: ");
	        		String ID = input.next();
	        		Account newAccount = new Account(name, ID);
	        		System.out.println("Account created \n" + newAccount.toString());
	        		
	        		break;
	        }
		} while(option != 0);
        
	}
}
