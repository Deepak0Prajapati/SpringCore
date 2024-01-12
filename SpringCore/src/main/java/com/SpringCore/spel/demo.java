package com.SpringCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Demo")
public class demo {
	
	@Value("#{22+22}")
	private int x;
	@Value("#{44+66}")
	private int y;
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	@Value("#{ T(java.lang.Math).E}")
	private double e;
	@Value("#{ new java.lang.String('deepak prajapati')}")
	private String name;
	
	@Value("#{ 8>3 }")
	private boolean IsActive;
	@Override
	public String toString() {
		return "demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", IsActive=" + IsActive
				+ "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
