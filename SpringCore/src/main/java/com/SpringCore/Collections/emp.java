package com.SpringCore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class emp {
	private String EmployeeName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties props;
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public emp(String employeeName, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		EmployeeName = employeeName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "emp [EmployeeName=" + EmployeeName + ", phone=" + phone + ", address=" + address + ", courses="
				+ courses + ", props=" + props + "]";
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	
	

}
