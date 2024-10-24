package com.task2;



import java.io.Serializable;

public class Employee1 implements Serializable {
    private int id;
    private String name;
    private double hourlyWage;
    private int totalHoursWorked;

    // Default constructor
    public Employee1() {}

    // Parameterized constructor
    public Employee1(int id, String name, double hourlyWage) {
        this.id = id;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.totalHoursWorked = 0; // Initialize work hours to zero
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    // Add work hours
    public void addWorkHours(int hours) {
        this.totalHoursWorked += hours;
    }

    // Calculate salary
    public double calculateSalary() {
        return this.totalHoursWorked * this.hourlyWage;
    }

    // Generate salary slip
    public String generateSalarySlip() {
        return "Salary Slip for " + name + "\n" +
               "Employee ID: " + id + "\n" +
               "Hourly Wage: " + hourlyWage + "\n" +
               "Total Hours Worked: " + totalHoursWorked + "\n" +
               "Total Salary: " + calculateSalary() + "\n";
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Hourly Wage=" + hourlyWage + "]";
    }
}

