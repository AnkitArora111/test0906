// Package declaration
package ArrayList;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declaration of a raw ArrayList (can store heterogeneous data)
		ArrayList mylist = new ArrayList();
		
		// Adding different types of data (heterogeneous)
		mylist.add(100);        // Integer
		mylist.add(10.5);       // Double
		mylist.add("Ram");      // String
		mylist.add('A');        // Character
		mylist.add(true);       // Boolean
		mylist.add(100);        // Duplicate Integer
		mylist.add(null);       // Null value
		
		// Declaration of a type-safe (generic) ArrayList for Integer only
		ArrayList<Integer> mylist2 = new ArrayList<>();
		
		// Adding Integer elements to mylist2
		mylist2.add(100);
		mylist2.add(200);
		mylist2.add(2);
		mylist2.add(987);
		mylist2.add(100);  // Duplicate allowed
		
		// Displaying contents of mylist2
		System.out.println(mylist2);
		
		// Displaying the heterogeneous list
		System.out.println("When we are adding heterogeneous data: " + mylist);
		
		// Inserting "Pramod" at index 4
		mylist.add(4, "Pramod");
		System.out.println("Updated heterogeneous data: " + mylist);
		
		// Getting the size of the list
		System.out.println("Size of the ArrayList: " + mylist.size());
		
		// Adding all elements from mylist2 to mylist
		mylist.addAll(mylist2);
		System.out.println("After adding all elements from mylist2: " + mylist);
		
		// Removing element at index 4 ("Pramod")
		mylist.remove(4);
		System.out.println("After removing index 4: " + mylist);
		
		// Replacing element at index 4 in mylist2 with 3
		mylist2.set(4, 3);
		
		// Replacing element at index 6 in mylist with "set"
		mylist.set(6, "set");
		
		// Display updated mylist2
		System.out.println("Updated mylist2: " + mylist2);
		
		// Display updated mylist
		System.out.println("Updated mylist: " + mylist);
		
		// Check if "Ram" exists in mylist
		boolean con = mylist.contains("Ram");
		System.out.println("Contains 'Ram': " + con);
		
		// Get element at index 5 from mylist
		System.out.println("Get element at index 5 from mylist: " + mylist.get(5));
	}
}
