// Package declaration (optional, based on your project structure)
package ArrayList;

// Importing ArrayList class from the java.util package
import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        // Creating an ArrayList without specifying the type (raw type)
        @SuppressWarnings("rawtypes")
		ArrayList<Comparable> mylist = new ArrayList<Comparable>();

        // Adding different types of data to the ArrayList
        mylist.add(29);         // Integer
        mylist.add(29.2);       // Double
        mylist.add("Welcome");  // String
        mylist.add('A');        // Character
        mylist.add(null);       // null value
        mylist.add(null);       // another null value (duplicates allowed)

        // Printing the entire ArrayList
        System.out.println(mylist);

        // Displaying the size of the ArrayList
        System.out.println("Size of ArrayList " + mylist.size());

        // Displaying the content of the ArrayList again
        System.out.println("ArrayList " + mylist);
    }

}
