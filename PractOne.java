package arraysOne;

import java.util.Arrays;

public class PractOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		single dimensional array
//		---------
//		1) Declare an array
//		2) add values into array
//		3) Find size of an array
//		4) read single value from an array
//		5) read multiple values from an array
		
		//1) Declaring an Array
		
//		//Approach 1: Declaration and adding values
//		
		//int a [] =new int[5];
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
		//Approach 2- Declaration and adding values into Array
		
		int a[] = {10,20,30,40,50,60,10};
		
		
//		3) Find size of an array
		System.out.println(a.length);// Returns the lenght of an Array
		
		//4.read single value from an Array
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		//5Read multiple values from an Array
		
		System.out.println(Arrays.toString(a));
		
		//for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	

}
