package TestInheritance; // Package name (can be renamed or removed if not using packages)

public class PalindromeTestone {

	public static void main(String[] args) {
		
		// Step 1: Define the input string to be checked
		String input = "Madam";
		
		// Step 2: Create an empty string to store the reversed version
		String output ="" ;
		
		// Step 3: Loop through the input string in reverse order
		for (int i = input.length() - 1; i >= 0; i--) {
			
			char c1 = input.charAt(i);   // Get character from the end
		    output = output + c1;        // Append to output to build reversed string
		}


//		| Loop Cycle | `i` Value | `input.charAt(i)` | `output = output + c1`( After Append )|
//		| ---------- | --------- | ----------------- | --------------------- |
//		| 1st        | 4         | `'m'`             | `"m"`                 |
//		| 2nd        | 3         | `'a'`             | `"ma"`                |
//		| 3rd        | 2         | `'d'`             | `"mad"`               |
//		| 4th        | 1         | `'a'`             | `"mada"`              |
//		| 5th        | 0         | `'M'`             | `"madaM"`             |
		
		// Step 4: Print the Original and reversed string
		System.out.println("Orginal: "+input);
		System.out.println("Reversed: " + output);
		
		// Step 5: Compare original and reversed strings (ignoring case)
		if (input.equalsIgnoreCase(output)) {
			System.out.println("This is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		
	}
}
