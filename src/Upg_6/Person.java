package Upg_6;

import java.util.ArrayList;

public class Person {
	//instance variables
	private String pNbr;
	private String name;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	//constructor
	public Person(String pNbr, String name, PersonRegister personRegister) {
		this.pNbr = pNbr;
		this.name = name;
		personRegister.addPerson(this);
	}
	
	//setters
	public void setPNbr (String pNbr) {
		this.pNbr = pNbr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	
	//account management
	public void addAccount(Account account) {
		accountList.add(account);
	}
	public void removeAccount(Account account) { //...........behövs denna?.. stämmer denna?.......
		if(accountList.contains(account)) {
			accountList.remove(account);
		}else {
			System.out.println("Could not find account " + account.getNbr() + "(accountNbr) to delete in the accountList.");
		}
	}
	
	//getters
	public String getPNbr() {
		return pNbr;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
}
