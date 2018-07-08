package br.com.henriquesousa.BankAccount;

public class Account {
	private String name;
    private String ID;
    //todo add password
    private double balance = 0;

    public double minimumWithdrawal;
    public double maximumWithdrawal;

    public Account(String name, String ID) {
    	this.name = name;
    	this.ID = ID;
    }
    
    @Override
    public String toString() {
    	return "Name: " + name + "\n" +
    			"ID: " + ID + "\n" +
    			"Balance: " + balance;
    }
    
    public double deposit(){
        return 0;
    }
    public void withdraw(){
        return;
    }
    public void transferToAccount(Account otherAccount){
        return;
    }
}
