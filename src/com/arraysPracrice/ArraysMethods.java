package com.arraysPracrice;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,89,23,19};
		System.out.println(Arrays.toString(arr));
		int arr1[]= {12,89,38,20,47};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Sorted:"+Arrays.toString(arr1));
		int a[]= {10,20,50};
		int b[]= {10,20,40};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.compare(a, b));
		int arr2[]= {10,20,30,40,50};
		int index=Arrays.binarySearch(arr2, 40);
		System.out.println("index:"+index);
		int arr3[]=new int[5];
		System.out.println(Arrays.toString(arr3));
		Arrays.fill(arr3,7);
		System.out.println(Arrays.toString(arr3));
		int arr4[]= {2,3,4,5};
		int []cpy=Arrays.copyOf(arr4, 2);
		int[]cpr=Arrays.copyOfRange(arr4,0, 9);
		System.out.println(Arrays.toString(cpy));
		System.out.println(Arrays.toString(cpr));
	}

}
