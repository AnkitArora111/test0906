package TestInheritance;

public class ReverseSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Vikram sharma";
		String output = ""; //otua
		
		for(int i =12;i>=0;i--)
		{
			char c1= input.charAt(i);
			output = output+c1;
		}
		System.out.println("this is my input->"+input);
		System.out.println("this is my output->"+output);
	}



}
