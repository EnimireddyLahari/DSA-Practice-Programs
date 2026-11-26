package com.arraysPracrice;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details:");
		System.out.println("enter productid:");
		int productId=sc.nextInt();
		System.out.println("enter productname:");
		String productName=sc.next();
		System.out.println("enter productquantity:");
		float productQuantity=sc.nextFloat();
		System.out.println("enter discount:");
		double discount=sc.nextDouble();
		System.out.println("enter productavaialability :");
		boolean productAvailable=sc.nextBoolean();
		System.out.println("enter productprice :");
		int productPrice=sc.nextInt();
		System.out.println("enter product code:");
		String productCode=sc.next();
		System.out.println("enter companycode:");
		char productCompanyCode=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter product description");
		String productDescription=sc.nextLine();
		System.out.println("productId:"+productId);
		System.out.println("productName:"+productName);
		System.out.println("productQuantity:"+productQuantity);
		System.out.println("productPrice:"+productPrice);
		double disamnt=productPrice*(10.0/100);
		System.out.println(disamnt);
		double totalPrice=productPrice-disamnt;
	    System.out.println("totalPrice you have to pay:"+totalPrice);
		System.out.println("productAvailable:"+productAvailable);
		System.out.println("productCode:"+productCode);
		System.out.println("productCompanyCode:"+productCompanyCode);
		System.out.println("productDescription:"+productDescription);
		
		
		
		
		
		

	}

}
