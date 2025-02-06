package com.endes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    List<Employee> listaEmpleados;
    
    
    public EmployeeManager() {
    	listaEmpleados = new ArrayList<>();
	}


	public void addEmployee(Employee employee) {
    	listaEmpleados.addLast(employee);
    }


	@Override
	public String toString() {
		return "EmployeeManager [listaEmpleados=" + listaEmpleados + "]";
	}
    
    /*public void printEmployees() {
        System.out.println("List of employees:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(employeeNames[i] + ", Years in company: " + employeeYears[i]);
        }
    }*/
    
    /*public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }*/
}
