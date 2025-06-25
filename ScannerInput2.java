package Day3;

import java.util.Scanner;

public class ScannerInput2 {

    public static void main(String[] args) {
        
        Scanner s2 = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num_1 = s2.nextInt();
        System.out.println("You entered: " + num_1);
        
        System.out.println("Enter second number");
        int num_2 = s2.nextInt();
        System.out.println("You entered: " + num_2);
        
        int sum = num_1 + num_2;
        System.out.println("Sum of the two numbers: " + sum);

        s2.close(); // always a good practice
    }
//    //| Method          | Description                                                                         |
//    | --------------- | ----------------------------------------------------------------------------------- |
//    | `next()`        | Reads the next word (token) until space is encountered.                             |
//    | `nextLine()`    | Reads the entire line of input (including spaces) until the newline is encountered. |
//    | `nextInt()`     | Reads an `int` value from the input.                                                |
//    | `nextDouble()`  | Reads a `double` value.                                                             |
//    | `nextFloat()`   | Reads a `float` value.                                                              |
//    | `nextLong()`    | Reads a `long` value.                                                               |
//    | `nextShort()`   | Reads a `short` value.                                                              |
//    | `nextByte()`    | Reads a `byte` value.                                                               |
//    | `hasNext()`     | Returns `true` if the scanner has another token in its input.                       |
//    | `hasNextInt()`  | Returns `true` if the next token can be interpreted as an `int`.                    |
//    | `hasNextLine()` | Returns `true` if there is another line in the input.                               |
//    | `close()`       | Closes the scanner and releases resources.                                          |

}
