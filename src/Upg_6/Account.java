package Upg_6;

public class Account {
	//instance variables
	private String nbr;
	private Double balance;
	
	//constructor
	public Account(String nbr, Double balance) {
		this.nbr = nbr;
		this.balance = balance;
	}
	
	//setters
	public void setNbr(String accountNumber) {
		nbr = accountNumber;
	}
	public void setBalance(Double newBalance) {
		balance = newBalance;
	}
	
	//getters
	public String getNbr() {
		return nbr;
	}
	public Double getBalance() {
		return balance;
	}
	
	//credit and withdraw
	public void credit (double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
}

