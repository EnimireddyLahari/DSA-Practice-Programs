package com.arraysPracrice;

public class hourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4,5,6},
				    {7,8,9,10,11,12},
				    {13,14,15,16,17,18},
				    {19,20,1,2,3,4},
				    {5,6,7,8,9,10},
				    {11,12,13,14,15,16}};
		int max=0;
		for(int i=0;i<3;i++)
		{
			int sum=0;
			
			for(int j=0;j<3;j++)
			{
				sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				System.out.println("sum:"+sum);
				if(max<sum)
				{
					max=sum;
				}
			}
			
		}
		System.out.println(max);

	}

}
