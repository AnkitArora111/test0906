package StringTest;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name1 = "ram";
		String Name2 ="arm1";
		
		  char []c1 = Name1.toCharArray();
		  char []c2 =Name2.toCharArray();
		  
		  Arrays.sort(c1);
		  Arrays.sort(c2);
		  if(Arrays.equals(c1, c2)==true)
		  {
			  System.out.println("They are Aragram");
		  }
		  else
		  {
			  System.out.println("Not a Anagram");
		  }
		
	}

}
