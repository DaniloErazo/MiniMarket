package model;

import java.util.ArrayList;

import exceptions.DayMismatchException;
import exceptions.IdentificationException;

public class Minimarket {
	private int attempEntring;
	private ArrayList<Person> people;
	
	public int getAttempEntring() {
		return attempEntring;
	}
	public void setAttempEntring(int attempEntring) {
		this.attempEntring = attempEntring;
	}
	
	public void addPerson(String id, long idNumber, int actualDay) throws IdentificationException, DayMismatchException {
		
	}
}
