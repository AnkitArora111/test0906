package Inheritance1;

class Pet_A1{
	
	void eat()
	{
		System.out.println("This is Animal");
	}
}
class Cat extends Animal{
	
	void sleep()
	{
		System.out.println("this Dog is sleeping");
	}
}
public class SingleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat C1 =new Cat();
		C1.eat();
		C1.sleep();

	}

}
