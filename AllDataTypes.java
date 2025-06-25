package junePractice;

public class AllDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bytevalue= 100;
		short shortvalue = 32000;
		int intvalue = 10000;
		long longvalue = 100000000L;
		
		float floatvalue = 5.55f;
		double doublevalue = 19.99;
		
		 char grade = 'A';                 // 2 bytes, single characters in single quotes

        // 4. Boolean type
        boolean isJavaFun = true;         // 1 bit (stores true or false)

        // 5. String (not a primitive, but commonly used)
        String name = "Ankit";            // Class type, stores sequences of characters

        // Printing all values
        System.out.println("Byte Value: " + bytevalue);
        System.out.println("Short Value: " + shortvalue);
        System.out.println("Int Value: " + intvalue);
        System.out.println("Long Value: " + longvalue);

        System.out.println("Float Value: " + floatvalue);
        System.out.println("Double Value: " + doublevalue);

        System.out.println("Character: " + grade);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + name);
    }
				
	}


