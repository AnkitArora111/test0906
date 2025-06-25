package examTest;

import java.lang.reflect.Array;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array1 =new int [3];
		array1[0] = 11;
		array1[1] = 22;
		array1[2] = 33;
		

		int []array2 =new int [3];
		array2[0] = 11;
		array2[1] = 22;
		array2[2] = 33;

		int []arraymerged12 = new int[array1.length+array2.length];
		
		for (int i =0; i<array1.length; i++)
		{
			arraymerged12[i]= array1[i];
		}
		
		for (int j =0; j<array1.length; j++)
		{
			arraymerged12[i]= array1[i];e
		}
	}
	

}
