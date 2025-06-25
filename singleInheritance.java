package Inheritance1;


class Animal{

	void eat()
	{
		System.out.println("Animal eat food");
	}
	
}
class Dog extends Animal{
	
	void bark()
	{
		System.out.println("The dog bark");
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		
		Dog pr = new Dog();
		pr.bark();
		pr.eat();

	}

}
