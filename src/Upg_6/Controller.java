package Upg_6;

import javax.swing.JFrame;
import java.util.ArrayList;

public class Controller {
	PersonRegister persons;
	JFrame frmPersonAccount;
	
	//constructor
	public Controller(PersonRegister perReg, JFrame frame) {
		this.persons = perReg;
		this.frmPersonAccount = frame;
	}
	
	
	//person register methods (persons management)
	public void addPerson (String pNbr, String name) {
		Person p = new Person(pNbr, name);
		persons.addPerson(p);
	}
	
	public void removePerson(String pNbr) {
		persons.removePerson(pNbr);
	}
	
	public String[] findPerson(String pNbr) {
		Person p = persons.findPerson(pNbr);
		String[] stringsToReturn = null;
		if(p != null && p.getAccountList() != null) {
			stringsToReturn = new String[3];
			stringsToReturn[0] = p.getName();
			stringsToReturn[1] = p.getPNbr();
			String accounts = "";
			for(Account ac : p.getAccountList()) {
				accounts += (ac.getNbr() + "; ");
			}
			stringsToReturn[2] = accounts;
		}else if(p != null) {
			stringsToReturn = new String[2];
			stringsToReturn[0] = p.getName();
			stringsToReturn[1] = p.getPNbr();
		}
		return stringsToReturn;
	}
	
	
	//person methods (account management)
	public void addAccount(String nbr, Double balance, Person owner) {
		Account ac = new Account(nbr, balance, owner);
		owner.addAccount(ac);
	}
	
	public void removeAccount(String acNbr, Person owner) {
		owner.removeAccount(acNbr);
	}
	
	public String[] findAccount(String acNbr) { // looks whether if someone has the account
		String[] stringsToReturn = null;
		for(Person p : persons.getPersonList()) {
			for(Account ac : p.getAccountList()) {
				if(ac.getNbr().equals(acNbr)) {
					stringsToReturn = new String[4];
					stringsToReturn[0] = acNbr;
					stringsToReturn[1] = ac.getBalance().toString();
					stringsToReturn[2] = p.getPNbr();
					stringsToReturn[3] = p.getName();
				}
			}
		}
		return stringsToReturn;
	}
	
	public String[] findPersonsAccounts (String pNbr) {
		String[] stringsToReturn = null;
		Person p = persons.findPerson(pNbr);
		if(p != null) {
			ArrayList<Account> accounts = p.getAccountList();
			stringsToReturn = new String[accounts.size()];
			for(int i = 0; i < stringsToReturn.length; i++) {
				stringsToReturn[i] = accounts.get(i).getNbr() + " | " + accounts.get(i).getBalance().toString();
			}
		}
		return stringsToReturn;
	}
}
