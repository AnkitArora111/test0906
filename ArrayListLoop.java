package ArrayList;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> mylist3 = new ArrayList<Comparable>();
		mylist3.add(22);
		mylist3.add("Ram");
		mylist3.add('A');
		mylist3.add(10.2);
		mylist3.add(222);
		mylist3.add(224);
		mylist3.add(true);
		mylist3.add(null);

//		for(int i =0;i<mylist3.size();i++)
//		{
//			System.out.println("By using for loop: "+mylist3.get(i));
//		}
		int i=0;
		while(i<mylist3.size())
		{
			
		System.out.println("By Using while Loop:  "+mylist3.get(i));
		i++;
	}
	}
}
		

	

