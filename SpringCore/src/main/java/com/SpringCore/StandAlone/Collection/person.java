package com.SpringCore.StandAlone.Collection;

import java.util.List;
import java.util.Map;

public class person {
	private List<String> friends;
	private Map<String, String> feestructure;

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public person(List<String> friends) {
		super();
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", feestructure=" + feestructure + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, String> feestructure) {
		this.feestructure = feestructure;
	}
	
	

}
