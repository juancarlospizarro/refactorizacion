package com.endes;

public class Employee {

	String firstName;
	int enterpriseYears;
	
	public Employee(String firstName, int enterpriseYears) {
		this.firstName = firstName;
		this.enterpriseYears = enterpriseYears;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getEnterpriseYears() {
		return enterpriseYears;
	}

	public void setEnterpriseYears(int enterpriseYears) {
		this.enterpriseYears = enterpriseYears;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", enterpriseYears=" + enterpriseYears + "]";
	}

}
