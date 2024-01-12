package com.SpringCore.ci;

public class addition {
	private int a;
	private int b;
	addition(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("Constructor working : int, int");
		
	}
	addition(double a,double b){
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor working : double, double");
		
	}
	void doSum() {
		System.out.println("sum is:"+(this.a+this.b));
		
	}

}
