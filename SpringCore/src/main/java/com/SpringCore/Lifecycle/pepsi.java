package com.SpringCore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean {
	private int price;

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pepsi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("recycling bottle woith destroy method.....");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("drinking pepsi through init.....");
	}
	

}
