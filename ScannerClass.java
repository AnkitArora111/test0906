package junePractice;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name");
			String name = sc.nextLine();
			
			System.out.println("Your name :  "+name);
			System.out.println("Enter number");
			int num_1 = sc.nextInt();
			System.out.println("lucky number: "+name+ " " +num_1);
		}
	}

}
