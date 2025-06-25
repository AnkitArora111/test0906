package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList mylist = new ArrayList<Comparable>();

	        // Adding different types of data to the ArrayList
	        mylist.add(29);         // Integer
	        mylist.add(29.2);       // Double
	        mylist.add("Welcome");  // String
	        mylist.add('A');        // Character
	        mylist.add(null);       // null value
	        mylist.add(null);       // another null value (duplicates allowed)
	        System.out.println(mylist);
	        
	        //Remove element from arrayList
	        mylist.remove(5);
	        System.out.println("After removing: "+mylist);
	        
	        mylist.add(2, "Rahul");
	        System.out.println(mylist);
	        
	        mylist.set(2,"Pankaj" );
	        System.out.println(mylist);
	        
	      boolean e1 = 		mylist.isEmpty();
	      System.out.println(e1);
	      
	      
	}

}
