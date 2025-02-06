package com.endes;

/**
 * La clase Employee representa un empleado de una empresa. 
 * Contiene información sobre el nombre del empleado y los años que lleva trabajando en la empresa.
 * 
 * @author Juan Carlos Pizarro Alonso
 */

public class Employee {

	String firstName;
	int enterpriseYears;
	
	/**
	 * Constructor de la calse Employee
	 * 
	 * @param firstName
	 * @param enterpriseYears
	 */
	public Employee(String firstName, int enterpriseYears) {
		this.firstName = firstName;
		this.enterpriseYears = enterpriseYears;
	}
	
	/**
	 * Metodo para obtener el nombre del empleado
	 * 
	 * @return firstName Nombre del empleado
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Metodo para establecer el nombre del empleado
	 * 
	 * @param firstName Nombre del empleado
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Metodo para obtener los años del empleado en la empresa
	 * 
	 * @return enterpriseYears Años del empleado en la empresa
	 */
	public int getEnterpriseYears() {
		return enterpriseYears;
	}
	
	/**
	 * Metodo para establecer los años del empleado en la empresa
	 * 
	 * @param enterpriseYears Años del empleado en la empresa
	 */
	public void setEnterpriseYears(int enterpriseYears) {
		this.enterpriseYears = enterpriseYears;
	}
	
	/**
	 * Metodo para obtener el nombre del empleado en formato cadena
	 * 
	 * @return Nombre del empleado junto a los años que lleva en la empresa
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", enterpriseYears=" + enterpriseYears + "]";
	}

}
