package model;

import java.util.ArrayList;

import exceptions.DayMismatchException;
import exceptions.IdentificationException;

public class Minimarket {
	private int attempEntring;
	private ArrayList<Person> people;
	
	public Minimarket() {
		people= new ArrayList<Person>();
	}
	
	public int getAttempEntring() {
		return attempEntring;
	}
	public void setAttempEntring(int attempEntring) {
		this.attempEntring = attempEntring;
	}
	
	public void addPerson(String id, long idNumber, int actualDay) throws IdentificationException, DayMismatchException {
		
		idType type = idType.valueOf(id);
		attempEntring++;
		
		if(type.equals(idType.TI)) {
			throw new IdentificationException();
		}
		int secondLast = (int)(idNumber/10)%10;
		
		if((secondLast%2==0 && actualDay%2==0) || (secondLast%2!=0 && actualDay%2!=0)) {
			throw new DayMismatchException();
		}
		
		people.add(new Person(idNumber,type));
		
	}
}
