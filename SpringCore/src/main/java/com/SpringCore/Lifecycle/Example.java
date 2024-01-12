package com.SpringCore.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String sample;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String sample) {
		super();
		this.sample = sample;
	}

	@Override
	public String toString() {
		return "Example [sample=" + sample + "]";
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("creating sample through init method...");
	}
	
	@PreDestroy
	public void  end() {
		System.out.println("freeing resources through destroy method....");
		
	}


}
