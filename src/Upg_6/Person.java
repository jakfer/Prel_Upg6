package Upg_6;

import java.util.ArrayList;

public class Person {
	//instance variables
	private String pNbr;
	private String name;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	//constructor
	public Person(String pNbr, String name) {
		this.pNbr = pNbr;
		this.name = name;
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
		if(findAccount(account.getNbr()) == null) {	//look if person already has account first
			accountList.add(account);
		}else {
			//System.out.println("The person already has the account");
		}
	}
	public Account findAccount (String acNbr) { // check if person has the account
		for(Account ac : accountList) {
			if(ac.getNbr().equals(acNbr)) {
				return ac;
			}
		}
		//Systm.out.println("person does not have account");
		return null;
	}
	public void removeAccount(String acNbr) {
		Account ac = findAccount(acNbr);
		if(accountList.contains(ac)) {
			accountList.remove(ac);
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
