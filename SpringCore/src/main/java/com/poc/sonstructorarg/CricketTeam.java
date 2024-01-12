package com.poc.sonstructorarg;

public class CricketTeam {
	private String name;
	//dependent class
	private CricketCoach teamCoach;

	  public CricketTeam(String name, CricketCoach coach) {

	System.out.println("Constructor: parameterized constructor is called CricketTeam");
	     this.name = name;
	    this.teamCoach = coach;

	  }

	  public String getInstruction() {

	return "Team Name: " + name + "----" + teamCoach.getDailyWorkout();

	  }

}
