package model;

public class Person {
	private long idNumber;
	private idType idType;
	
	public Person(long id, idType type) {
		this.idNumber=id;
		this.idType=type;
	}
	public long getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	public idType getIdType() {
		return idType;
	}
	public void setIdType(idType idType) {
		this.idType = idType;
	}
}
