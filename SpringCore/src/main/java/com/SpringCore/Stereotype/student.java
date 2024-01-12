package com.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class student {
	@Value("deepak")
	private String StudentName;
	@Value("ghaziabad")
	private String city;
	@Value("#{list}")
	private List<String> Address;
	
	
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [StudentName=" + StudentName + ", city=" + city + ", Address=" + Address + "]";
	}
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	
	

}
