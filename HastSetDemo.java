package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class HastSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to declaration
		HashSet myset =new HashSet();
		//HashSet<String>myset=new HashSet<String>();
		
		myset.add(100);
		myset.add('A');
		myset.add("Ank");
		myset.add(100);
		myset.add(1222);
		myset.add(null);
		myset.add(null);


		System.out.println(myset);
		
		myset.remove(100);
		System.out.println(myset);

		ArrayList a1 =new ArrayList(myset);
		System.out.println(a1);
		System.out.println(a1.get(2));//1222
	}

}
