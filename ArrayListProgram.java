// Declares the package this file belongs to
package collectionPractice;

// Imports the ArrayList class from java.util package
import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		// Create and initialize the first ArrayList (a1)
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(71);
		a1.add(89);
		a1.add(90);
		a1.add(99);
		a1.add(89111);
		a1.add(2119);
		a1.add(22121);

		// Print the elements of a1
		System.out.println(a1);

		// Create and initialize the second ArrayList (a2)
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(11);
		a2.add(9);
		a2.add(00); // 00 is interpreted as 0
		a2.add(21);
		a2.add(19);
		a2.add(1);

		// Add all elements of a1 to a2
		a2.addAll(a1);

		// Print the combined list
		System.out.println(a2);

		// Insert 10000 at index 1
		a2.add(1, 10000);

		// Print the updated list
		System.out.println("New A2 is :" + a2);

		// Add all elements of a1 to a2 starting from index 5
		a2.addAll(5, a1);

		// Print a2 after inserting a1 again
		System.out.println(a2);

		// Check if a1 is empty
		System.out.println(a1.isEmpty()); // false

		// Uncommenting the line below would clear a1
		// a1.clear();

		// Check again if a1 is empty
		System.out.println(a1.isEmpty()); // still false because clear() is commented

		// Check if a2 contains 10000
		boolean b2 = a2.contains(10000);
		System.out.println("It contains 10000: " + b2);

		// Check if a2 contains all elements of a1
		boolean b3 = a2.containsAll(a1);
		System.out.println("It contains a1 collection: " + b3);

		// Create and initialize a third ArrayList (a3)
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10001);
		a3.add(100021);
		a3.add(29281);
		a3.add(12221);
		a3.add(2911);
		a3.add(19); // Duplicate value (also in a2)
		a3.add(9999);

		// Add all elements from a1 to a3
		a3.addAll(a1);
		System.out.println(a3);

		// Remove the element at index 2
		a3.remove(2);
		System.out.println("This is a3: " + a3);

		// Add all elements from a1 again to a3
		a3.addAll(a1);
		System.out.println("A1 added in a3: " + a3);

		// Try to remove collection a1 from a3 (NOTE: this doesn't remove elements — it fails silently)
		// This line won't remove anything because remove(Object o) expects a single element, not a collection.
		a3.removeAll(a1);
		
		boolean b1 = a1.equals(a3);
		System.out.println(b1);
		System.out.println("Collection remove: " + a3);

	}
}
