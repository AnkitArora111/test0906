package examPactice;

import examTest.AccessModifiers;

public class StaticMethod {

	
	static void add() {
		
		int a = 30;
		int b = 45;
		int c = a+b;
		System.out.println(c);
	}
		static void sub() {
			
			int a1 = 50;
			int b1 = 45;
			int c1 = a1-b1;
			System.out.println(c1);

	}
		static void mul() {
			
			int a2 = 3;
			int b2 = 4;
			int c2 = a2*b2;
			System.out.println(c2);

	}
		static void mod() {
			
			int a3 = 13;
			int b3 = 3;
			int c3 = a3%b3;
			System.out.println(c3);

	}
	public static void main(String[] args) {
	
		add();
		sub();
		mul();
		mod();
		
	}
	class People extends AccessModifiers{
		
		AccessModifiers a2= new AccessModifiers();
	
	}
	
	
}
