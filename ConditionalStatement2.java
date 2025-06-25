package examPactice;

public class ConditionalStatement2 {

	public static void main(String[] args) {
//		
//		Statement			Use Case
//		if					Run a block if condition is true
//		if-else				Choose between two blocks
//		if-else if-else		Check multiple conditions
//		nested if			Combine conditions inside each other
//		switch				Handle fixed multiple choices (cleaner than if-else for fixed values)
		int age = 10;
		if (age%2==0) {
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Old number");
		}
//		if-else if-else Ladder
//		Checks multiple conditions one by one.
		
		int marks = 93;
		if (marks>=90) {
			
			System.out.println("Grade A");
		}
		else if (marks >= 75)
		{
			System.out.println("Grade B");
			
		}
		else if (marks >= 40)
		{
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
			
		}
		
}

}
