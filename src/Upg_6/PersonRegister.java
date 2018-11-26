package Upg_6;

import java.util.ArrayList;

public class PersonRegister {
	//instance variable
	private ArrayList<Person> personList = new ArrayList<Person>();
	
	//constructor
	public PersonRegister() {
		
	}
	
	//getter
	public ArrayList<Person> getPersonList(){
		return personList;
	}
	//setter
	public void setPersonList(ArrayList<Person> newPersonList) {
		personList = newPersonList;
	}
	
	
	//register management
	public void addPerson (Person p) { //add person
		if(findPerson(p.getPNbr()) == null) {
			personList.add(p);
		}else {
			System.out.println("Person " + p + " is already in the PersonRegister.");
		}
	}
	
	public Person findPerson (String pNbr) { //find person
		for(Person person : personList) {
			if(person.getPNbr().equals(pNbr)) {
				return person;
			}
		}
		System.out.println("Could not find a Person with the pNbr: " + pNbr + " in the PersonRegister.");
		return null;
	}
	
	public Person removePerson(String pNbr) { //remove person
		for(Person person : personList) {
			if(person.getPNbr().equals(pNbr)) {
				personList.remove(person);
				return person;
			}
		}
		System.out.println("Could not find a Person with the pNbr: " + pNbr + " to remove from the PersonRegister.");
		return null;
	}
}

