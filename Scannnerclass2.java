package junePractice;

import java.util.Scanner;

public class Scannnerclass2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("enter you number");
			int P = scan.nextInt();
			 scan.nextLine(); // consume the leftover newline
			
			System.out.println("Enter you name");
			String D = scan.nextLine();
			System.out.println("You name and number  :"+D+" "+P);
		}


	}

}
