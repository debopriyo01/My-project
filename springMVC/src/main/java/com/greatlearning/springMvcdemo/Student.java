package com.greatlearning.springMvcdemo;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {

	// Hear we will be taking All the Veriebels :-
	
	public String First_Name;
	public String Last_Name;
	public String Contries;
	
	public LinkedHashMap <String,String > countries;
	public String favorietLanguage;
	public String[] operetionSystem;
	
	// Inside of The Contractor We will be Adding The Two contries Hear :-
	
	public Student() {
		
		countries=new LinkedHashMap<>();
		countries.put("IN","India");
		countries.put("US", "America");
		
	}	
		
		
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getContries() {
		return Contries;
	}
	public void setContries(String contries) {
		Contries = contries;
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}
	public String getFavorietLanguage() {
		return favorietLanguage;
	}
	public void setFavorietLanguage(String favorietLanguage) {
		this.favorietLanguage = favorietLanguage;
	}
	public String[] getOperetionSystem() {
		return operetionSystem;
	}
	public void setOperetionSystem(String[] operetionSystem) {
		this.operetionSystem = operetionSystem;
	}
	
	
	
	
	
}
