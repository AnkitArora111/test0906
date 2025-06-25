package Inheritance1;

class Parent1{ 
	
	int a = 90;
	void flat()
	{
		System.out.println(a);
	}
	
}
class child1 extends Parent1{
	
	int b = 30;
	void car()
	{
		System.out.println(b);
	}
}
class child2 extends Parent1{
	
	int c = 60;
	void home()
	{
		System.out.println(c);
	}
}
class child3 extends Parent1{
	
	int d = 10;
	void cash()
	{
		System.out.println(d);
	}
}


public class hierarchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 chobj = new child1();
		chobj.flat();
		chobj.car();
		
		child2 chobj1 = new child2();
		chobj1.flat();
		chobj1.home();
		
		child3 chobj2 = new child3();
		chobj2.flat();
		chobj2.cash();
	}

}
