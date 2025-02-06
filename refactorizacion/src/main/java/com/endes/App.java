package com.endes;

/**
 * Clase principal main
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee1 = new Employee("Pedro", 23);
        Employee employee2 = new Employee("Maria", 6);
        Employee employee3 = new Employee("Juan", 1);
        
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        
        EmployeeManager manager = new EmployeeManager();
        
        manager.addEmployee(employee1);
        
        manager.printEmployees();
        
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);
        
        manager.printEmployees();
        
    }
}
