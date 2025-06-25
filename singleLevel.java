package Inheritance1;

	class Parents 
	{
		int a =10;
		void display()
		{
			System.out.println(a);
		}
		
	}
	class Child extends Parents
	{
		int b = 20;
		void show()
		{
			System.out.println(b);
		}
	}
	
	public class singleLevel {
		
	public static void main(String[] args) {
	
		Child ch = new Child();
		ch.show();
		ch.display();

	}
//	Child inherits from Parent.
//
//	Child gets access to display() from Parent.
//
//	You can access both parent and child class methods using a Child object.

}
