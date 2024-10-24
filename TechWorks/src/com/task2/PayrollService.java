package com.task2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    private List<Employee1> employees = new ArrayList<>();
    private static final String FILE_NAME = "C:\\Users\\Manoj Naidu\\Downloads\\employee_data.txt";

    // Add a new employee
    public void addEmployee(Employee1 emp) {
        employees.add(emp);
    }

    // Record work hours for an employee
    public boolean recordWorkHours(int empId, int hours) {
        Employee1 emp = findEmployeeById(empId);
        if (emp != null) {
            emp.addWorkHours(hours);
            return true;
        }
        return false;
    }

    // Calculate salary for an employee
    public Double calculateSalary(int empId) {
        Employee1 emp = findEmployeeById(empId);
        return (emp != null) ? emp.calculateSalary() : null;
    }

    // Generate salary slip for an employee
    public String generateSalarySlip(int empId) {
        Employee1 emp = findEmployeeById(empId);
        return (emp != null) ? emp.generateSalarySlip() : "Employee not found";
    }

    // Find an employee by ID
    private Employee1 findEmployeeById(int id) {
        for (Employee1 emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    // Save employee data to file
    public void saveEmployeeData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load employee data from file
    public void loadEmployeeData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee1>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existing data found, starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

