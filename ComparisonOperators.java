package junePractice;

public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 1400;
		int b1 =400;
		
//		| Operator | Description           | Example  |
//		| -------- | --------------------- | -------- |
//		| `==`     | Equal to              | `a == b` |
//		| `!=`     | Not equal to          | `a != b` |
//		| `>`      | Greater than          | `a > b`  |
//		| `<`      | Less than             | `a < b`  |
//		| `>=`     | Greater than or equal | `a >= b` |
//		| `<=`     | Less than or equal    | `a <= b` |
		
		System.out.println("Equal to :"+ (a1==b1));
		System.out.println("Equal to :"+ (a1!=b1));
		
		if (a1==b1)
		{
		System.out.println("a1 is equal to b1 ");
		}
		else
		{
			System.out.println("Not Equal");
		}
		if (a1!=b1)
		{
			System.out.println("Not Equal to");
		}
		else
		{
			System.out.println("Equal to");
		}
		if (a1>b1)
		{
			System.out.println("A is greater than b");
		}
		else
		{
			System.out.println("b is greater equal to a");
		}
		if (a1<b1)
			{
				System.out.println("b is greater than a");
			}
			else
			{
				System.out.println("a is greater equal to b");
		}
		if (a1>=b1)
		{
			System.out.println("a is greater than equal b");
		}
		else
		{
			System.out.println("not Equal");
		}
	}
	
	

}
