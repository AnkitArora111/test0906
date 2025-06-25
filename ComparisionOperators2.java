package Day2;

public class ComparisionOperators2 {
	
	public static void main(String[] args) {
		
	//Type main and press Ctrl + Space (Autocomplete) → Select main method template
	//Type syso and press Ctrl + Space → Expands to System.out.println();
		// if blocks behave independently. Only the conditions that evaluate to true will result in their corresponding block being executed.
		
		//Multiple if block // in which all true will execute.
		
		int a = 10;
		int b = 20;
		if (a==10)
		{
			System.out.println("1");
		}
		if (a<=10)
		{
			System.out.println("2");
		}
		if (a>=10)
		{
			System.out.println("3");
		}
		if (a!=10)
		{
			System.out.println("4");
		}
		if (a>10)
		{
			System.out.println("5");
		}
		if (b<10)
		{
			System.out.println("6");
		}

	}

}
