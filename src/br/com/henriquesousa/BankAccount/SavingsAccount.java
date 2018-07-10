package br.com.henriquesousa.BankAccount;

public class SavingsAccount extends Account {
	private int numberOfWithdrawals = 2;
	private int numberOfTranfsers = 2;
	//todo add password

	public SavingsAccount(String name, String ID) {
	 	super(name, ID);
	}
	
    @Override
    public String toString() {
    	return "Name: " + name + "\n" +
    			"ID: " + ID + "\n" +
    			"Balance: " + balance + "\n" +
    			"Type: Savings Account";
    }
    @Override
    public double deposit(){
    	//todo
        return 0;
    }
    @Override
    public void withdraw(){
    	//todo
        return;
    }
    @Override
    public void transferToAccount(Account otherAccount){
    	//todo
        return;
    }
}
