package com.task2;



import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        PayrollService payrollService = new PayrollService();
        payrollService.loadEmployeeData(); // Load data at the start
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Payroll Pulse System");
            System.out.println("1. Add Employee");
            System.out.println("2. Record Work Hours");
            System.out.println("3. Calculate Salary");
            System.out.println("4. Generate Salary Slip");
            System.out.println("5. Save & Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(payrollService, sc);
                    break;
                case 2:
                    recordWorkHours(payrollService, sc);
                    break;
                case 3:
                    calculateSalary(payrollService, sc);
                    break;
                case 4:
                    generateSalarySlip(payrollService, sc);
                    break;
                case 5:
                    payrollService.saveEmployeeData();
                    System.out.println("Data saved. Exiting system.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    // Add a new employee
    private static void addEmployee(PayrollService payrollService, Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        sc.nextLine(); // Consume the newline
        String name = sc.nextLine();
        System.out.print("Enter Hourly Wage: ");
        double hourlyWage = sc.nextDouble();

        Employee1 emp = new Employee1(id, name, hourlyWage);
        payrollService.addEmployee(emp);
        System.out.println("Employee added successfully!");
    }

    // Record work hours for an employee
    private static void recordWorkHours(PayrollService payrollService, Scanner sc) {
        System.out.print("Enter Employee ID to record work hours: ");
        int id = sc.nextInt();
        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        if (payrollService.recordWorkHours(id, hours)) {
            System.out.println("Hours recorded successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Calculate salary for an employee
    private static void calculateSalary(PayrollService payrollService, Scanner sc) {
        System.out.print("Enter Employee ID to calculate salary: ");
        int id = sc.nextInt();

        Double salary = payrollService.calculateSalary(id);
        if (salary != null) {
            System.out.println("Employee Salary: " + salary);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Generate salary slip for an employee
    private static void generateSalarySlip(PayrollService payrollService, Scanner sc) {
        System.out.print("Enter Employee ID to generate salary slip: ");
        int id = sc.nextInt();
        String slip = payrollService.generateSalarySlip(id);
        System.out.println(slip);
    }
}

