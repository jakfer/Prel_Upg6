package Upg_6;

public class Account {
	//instance variables
	private String nbr;
	private Double balance;
	private Person owner;
	
	//constructor
	public Account() { //default
		
	}
	public Account(Person owner) { //only owner
		this.owner = owner;
	}
	public Account(String nbr, Double balance, Person owner) { //set everything
		this.nbr = nbr;
		this.balance = balance;
		this.owner = owner;
	}
	
	//setters
	public void setNbr(String nbr) {
		this.nbr = nbr;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	//getters
	public String getNbr() {
		return nbr;
	}
	public Double getBalance() {
		return balance;
	}
	public Person getOwner() {
		return owner;
	}
	
	//credit and withdraw
	public void credit (double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
}

