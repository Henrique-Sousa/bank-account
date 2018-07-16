package br.com.henriquesousa.BankAccount;

public class Account {
	protected String name;
    protected String ID;
    //todo add password
    protected double balance = 0;

    public double minimumWithdrawal;
    public double maximumWithdrawal;

    public Account(String name, String ID) {
    	this.name = name;
    	this.ID = ID;
    }
    
    public String getID() {
    	return this.ID;
    }
    
    @Override
    public String toString() {
    	return "Name: " + name + "\n" +
    			"ID: " + ID + "\n" +
    			"Balance: " + balance + "\n" +
    			"Type: Checking Account";
    }
    
    public double deposit(){
    	//todo
        return 0;
    }
    public void withdraw(){
    	//todo
        return;
    }
    public void transferToAccount(Account otherAccount){
    	//todo
        return;
    }
}
