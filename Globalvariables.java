package Day2;

public class Globalvariables {
	
	static int a = 100;//Global variables
	static int b = 200;//Global variables
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
		add();
		sub();
		
	}
//	//a and b are global static variables, accessible by all static methods in the class.
//
//The program performs simple addition and subtraction using these variables.
//
//This demonstrates how global variables can be reused in multiple methods without redefining them.

}
