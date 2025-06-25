package Day2;

public class StaticMethods {
		
		//Addition
		static void add()
		{
		int a = 20;
		int b = 60;
		int c = a+b;
		System.out.println(c);
		}
		
		//Sub
		static void sub()
		{
		int a1 =50;
		int b1 = 70;
		int c1 = a1-b1;
		System.out.println(c1);
		}
		
		//Multiplication
		static void mul()
		{
		int a2 = 40;
		int b2 = 40;
		int c2 = a2*b2;
		System.out.println(c2);
		}
		//Division
		static void Div()
		{
		int a3 = 50;
		int b3 = 100;
		int c3 = b3/a3;
		System.out.print("Result of Division is: "+c3);
		System.out.println(c3);
		}
		//modules
		
		static void mod()
		{
		int a4 = 20;
		int b4 = 40;
		int c4 = a4%b4;
		System.out.println(c4);
		}
		public static void main(String[] args) {
		
			add();
			sub();
			mul();
			Div();
			mod();
		}

	}

