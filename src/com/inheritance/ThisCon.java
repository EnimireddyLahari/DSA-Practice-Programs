package com.inheritance;
class ParentCon{
	public ParentCon()
	{
		this(39);
		System.out.println("parent default constructor 1");
	}
	public ParentCon(int age)
	{
		this.m1();
		System.out.println("parent param con2:"+age);
	}
	public void m1()
	{
		System.out.println("parent m1 method 3");
		
	}
}
public class ThisCon extends ParentCon{
	public ThisCon()
	{
		//super();
		this(34);
		System.out.println("i am def con of child 4:");
	}
	public ThisCon(int age)
	{
		this.m1();
		System.out.println("child param con 5:"+age);
	}
	public void m1() {
		System.out.println("i am child of m1 6:");
	}
	public static void main(String []args) {
		ThisCon tc=new ThisCon ();
		
	}

}
