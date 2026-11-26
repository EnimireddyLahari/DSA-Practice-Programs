package com.constructor;

public class WithoutConstructor {
		int stid;
		String sname;
		
		public void assign() {
		  stid=10;
		  sname="lahari";
		}
		public void display()
		{
			System.out.println(stid);
			System.out.println(sname);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WithoutConstructor obj=new WithoutConstructor();
			obj.assign();
			obj.display();
			

		}
}





