package com.SpringCore.JavaConfig;

import org.springframework.stereotype.Component;


public class Student {
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	void study() {
		samosa.Display();
		System.out.println("Studying.......");
	}

}
