package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListOfIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> lit = list.listIterator();
		
		// Forward traversal
		while (lit.hasNext()) {
			System.out.println("Forward: " + lit.next());
		}
		
		// Backward traversal
		while (lit.hasPrevious()) {
			System.out.println("Backward: " + lit.previous());
		}
	}
}
