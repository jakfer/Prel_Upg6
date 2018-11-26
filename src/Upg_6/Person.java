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
		//look if person already has account first
		if(!hasAccount(account)) {
			accountList.add(account);
		}else {
			//System.out.println("The person already has the account");
		}
	}
	public Boolean hasAccount (Account account) {
		for(Account ac : accountList) {
			if(ac == account) {
				return true;
			}
		}
		return false;
	}
	public void removeAccount(Account account) {
		if(accountList.contains(account)) {
			accountList.remove(account);
		}else {
			//System.out.println("Could not find account " + account.getNbr() + "(accountNbr) to delete in the accountList.");
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
