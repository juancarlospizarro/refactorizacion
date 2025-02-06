package com.endes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * La clase EmployeeManager gestiona una lista de empleados, proporcionando métodos para
 * agregar empleados a la lista y para imprimir la lista de empleados.
 * 
 * @author Juan Carlos Pizarro Alonso
 */
public class EmployeeManager {
    List<Employee> listEmployees;
    
    /**
     * Constructor de la clase EmployeeManager
     */
    public EmployeeManager() {
    	listEmployees = new ArrayList<>();
	}

    /**
     * Metodo para añadir un empleado a la lista de empleados
     * 
     * @param employee
     */
	public void addEmployee(Employee employee) {
    	listEmployees.addLast(employee);
    }

    /**
     * Metodo para mostrar los empleados de la lista empleados
     */
    public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : listEmployees) {
            System.out.println(employee);
        }
    }
}
