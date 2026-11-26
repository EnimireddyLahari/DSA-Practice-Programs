package com.inheritance;

class SuperDemo{
	int salary=60000;
	public void getSalary(int salary)
	{
		salary=40000;
		System.out.println("the parent salary:"+salary);
		System.out.println("the parent global salary:"+this.salary);
	}
	public void m1()
	{
		System.out.println("i am parent m1 method");
	}
	
}
public class ThisDemo extends SuperDemo{
	int salary=40000;
	public void getSalary(int salary)
	{
		salary=10000;
		System.out.println("my local salary:"+salary);
		System.out.println("my global salary:"+this.salary);
		System.out.println(this);
		this.m1();
		super.getSalary(50000);//from parent
		
	}
	public void m1()
	{
		System.out.println("i am child m1 method");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo ();
		td.getSalary(50000);
		

	}

}
