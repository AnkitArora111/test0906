package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList mylist5 = new ArrayList();

		mylist5.add(22222);
		mylist5.add("Rahul");
		mylist5.add("Ank");
		mylist5.add(10.2);
		mylist5.add(222);
		mylist5.add(222);
		mylist5.add(true);
		mylist5.add(null);
		
		Iterator it2 =mylist5.iterator();
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println("Empty:  "+mylist5.isEmpty());
		
		ArrayList mylist6 = new ArrayList();
		mylist6.add("Ank");
		mylist6.add("Rahul");
		mylist6.add(10.2);
		
		mylist5.removeAll(mylist6);
		System.out.println(mylist5);
		 
}
}
