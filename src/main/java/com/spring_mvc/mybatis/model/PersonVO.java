package com.spring_mvc.mybatis.model;

public class PersonVO {
	private int ID;
	private String PersonName;
	private int Sex;
	private String Adress;
	private int City;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public int getSex() {
		return Sex;
	}
	public void setSex(int sex) {
		Sex = sex;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getCity() {
		return City;
	}
	public void setCity(int city) {
		City = city;
	}
	
	
}
