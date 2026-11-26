package com.arraysPracrice;

public class Employee {
	int empid;
	String empname;
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	//override
	public String toString() {
		return empid+" "+empname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Employee emp0=new Employee(123,"devasena");
				Employee emp1=new Employee(124,"devasena");
				Employee emp2=new Employee(125,"devasena");
				Employee emp3=new Employee(126,"devasena");
				Employee emp[]= {emp0,emp1,emp2,emp3};
				for(Employee ee:emp)
				{
					System.out.println(ee);
				}
		

	}

}
