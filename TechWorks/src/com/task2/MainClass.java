package com.task2;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Employees you need to enter");
		int n=sc.nextInt();
		List<Employee> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
	   System.out.println("enter id");
		emp.setId(sc.nextInt());
		System.out.println("enter name");
		emp.setName(sc.next());
		sc.nextLine();
		System.out.println("enter workinghours");
		emp.setWorkinghours(sc.nextInt());
		System.out.println("enter hourlywages");
		emp.setHourlywage(sc.nextInt());
		list.add(emp);
		}
        double salary=salaryNeedToPay(emp.getWorkinghours(), emp.getHourlywage());
        for(int i=0;i<list.size();i++)
        {
        	 System.out.println(emp.toString());
        	 System.out.println("Salary needed to pay"+  salary);
        }
      }
	public static double salaryNeedToPay(int workinghours, int hourlywage)
	{
		double salary=workinghours*hourlywage;
		return salary;
	}
	
	
}
