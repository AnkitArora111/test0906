package junePractice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Q: Write a for loop that prints a pattern:
//		*
//		**
//		***
//		****

		//Q: How do you print only even numbers between 1 to 10 using a for loop?
		
		
//		int a =10;
//		int b =20;
//		
//		for(int i=2;i<=10;i++)
//			
//		{
//			if (i%2 ==0)
//			System.out.println("Even Number "+(i));
//		}
//		//Q: How do you print only odd numbers between 1 to 10 using a for loop?
//		
//		for(int i =1;i<=10;i++)
//		{
//			if(i%2==1)
//				System.out.println("odd number: "+(i));
//				
//		}
		//Q: Write a for loop that prints numbers from 10 to 1.

		for(int i =10;i>=1;i--)
		{
			System.out.println(i);
		}

		//Q: Write a for loop to calculate the sum of numbers from 1 to 100.
		int sum =0;
		for(int j =1;j<=100;j++)
			sum+=j;
		{
			System.out.println(sum);
		}
	}

}
