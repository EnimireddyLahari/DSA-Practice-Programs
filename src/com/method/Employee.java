package com.method;

public class Employee {
	public void dispalyEmployeeDetails()
	{
		System.out.println("Employee name is keerthi");
		System.out.println("Employee adress:kochi");
		System.out.println("Employee salary is:20000");
	}
	public double employeeSalary(int salary)
	{
		return salary*12;
		
	}
	public static void employeeCompany()
	{
		System.out.println("codegnan");
	}
	public void display(int empid,String empname)
	{
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
	}
	public static int employeeTimings(int hours)
	{
		//System.out.println("employee timings:"+hours);
		return hours;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.dispalyEmployeeDetails();
		System.out.println(emp.employeeSalary(20000));
		emp.employeeCompany();
		emp.display(101,"ram");
		System.out.println(emp.employeeTimings(8));
		
		
		

	}

}
