package com.SpringCore.Ref;

public class A {
	private int x;
	private b ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public b getOb() {
		return ob;
	}
	public void setOb(b ob) {
		this.ob = ob;
	}
	public A(int x, b ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	

}
