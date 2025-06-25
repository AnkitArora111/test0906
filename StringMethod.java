package junePractice;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Method				Description
//		length()			Returns number of characters
//		toUpperCase()		Converts to uppercase
//		toLowerCase()		Converts to lowercase
//		contains()			Checks if string contains another string
//		charAt(index)		Returns character at a position
//		substring(start)	Returns substring from index
//		substring(start, end)Returns substring from start to end-1
//		replace(old, new)	Replaces text
//		startsWith()		Checks if string starts with given prefix
//		endsWith()			Checks if string ends with given suffix
//		trim()				Removes leading and trailing white spaces
//		equals()			Compares strings (case-sensitive)
//		equalsIgnoreCase()	Compares strings ignoring case
		
		String name = "Java Automation";
		System.out.println("Java Automation's Length: " +name.length() );
		System.out.println("Uppercase: "+name.toUpperCase());
		System.out.println("Uppercase: "+name.toLowerCase());
		System.out.println("Contains "+name.contains("Java"));
		System.out.println("Character at index 6 "+name.charAt(6));
		System.out.println("Substring from index: "+name.substring(5));
		System.out.println("Substring Automation (5,15):"+name.substring(5, 15));
		System.out.println("Replace java with Python "+name.replace("Java", "Python"));
        System.out.println("Starts with 'Java': " + name.startsWith("Java"));
        System.out.println("Ends with 'ing': " + name.endsWith("ing"));

	}

}
