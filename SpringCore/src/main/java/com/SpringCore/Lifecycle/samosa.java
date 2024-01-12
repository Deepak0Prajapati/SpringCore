package com.SpringCore.Lifecycle;

public class samosa {
	private  int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public samosa(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("Inside init Method!!!");
	}
	public void destroy() {
		System.out.println("freeing the resoources!!");
	}
	

}
