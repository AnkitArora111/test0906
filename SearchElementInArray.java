package arraysOne;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter search element");
		int search_num = sc.nextInt();//Takes an integer input from the user and stores it in the variable search_num.
		
		boolean status = false;//A flag variable to keep track of whether the element is found or not.
		
		for(int i =0;i<a.length;i++)
		{
			if(search_num==a[i])
			{
				System.out.println("Element Found");
				status =true;
				break;
			}
					}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
