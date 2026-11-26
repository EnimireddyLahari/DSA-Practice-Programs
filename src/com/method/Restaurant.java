//display restaurant details
//cal food bill based on quantity and price
//cal gst on bill
//check weather restaurant is open or not
//check status of delivery based on codes

package com.method;

public class Restaurant {
	public static void restaurantDetailas()
	{
		System.out.println("restaurant name:"+"chillis");
		System.out.println("Restaurant location:"+"hyderabad");
		
	}
	public double bill(int quantity,int price)
	{
		System.out.println("bill:"+quantity*price);
		return quantity*price;
		
	}
	public double gst(int amount)
	{
		return amount*0.25;
	}
	public boolean ResOpenorNot(boolean b)
	{
		//boolean b=true;
		if(b==true)
		{
			System.out.println("open");
			
		}
		else
		{
			System.out.println("not open");
		}
		return b;
	}
	public int deliveryCode(int code)
	{
		if(code==0)
		{
			System.out.println("ready to delivery ");
		}
		else if(code==1)
		{
			System.out.println("packing your order");
		}
		else
		{
			System.out.println("your order is on the way");
		}
		return code;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rst=new Restaurant();
		rst.restaurantDetailas();
		System.out.println(rst.bill(2,300));
		System.out.println("gst is:"+rst.gst(600));
		rst.ResOpenorNot(true);
		 System.out.println("delivery check:"+rst.deliveryCode(3));
		 
		
		

	}

}
