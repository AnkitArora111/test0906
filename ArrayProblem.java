package junePractice;

import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "k v no 2 2321";
		int countofalpha = 0;
		int countofDigit=0;
		
		char[] c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i =0;i<c1.length;i++)
		{
		boolean b1 = Character.isAlphabetic(c1[i]);
		boolean b2 = Character.isDigit(c1[i]);
		
		if(b1==true)
		{
			System.out.println("Yes its a Alphabet");
			countofalpha++;
		}
		else
		{
			System.out.println("Not a Alphabet");
		}
		if(b2==true)
		{
			System.out.println("Yes its a DIGIT");
			countofDigit++;
		}
		else
		{
			System.out.println("Not a DIGIT");
		}
		
	}
		System.out.println("Count of alphabet in the given string is -->"+countofalpha);
		System.out.println("Count of Digit in the given string is -->"+countofDigit);
	}
}
	
