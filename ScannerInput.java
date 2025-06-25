package Day3;

import java.util.Scanner;
public class ScannerInput {
	
	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter you name: ");
		String name = s1.next();
		int age = s1.nextInt();
		System.out.println("Your name is:  "+name);
		System.out.println("your name age is  "+age);
		
		s1.close();
	}
	
	
}
