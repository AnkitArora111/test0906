package StringTest;

public class questionOne {

	public static void main(String[] args) {
		//Reverse a string
		
		String input = "auto";
		String output = ""; //otua
		
		
		for(int i=3; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
			
		}
		System.out.println("This is my input ->"+input);
		System.out.println("This is my output ->"+output);

	}

}
