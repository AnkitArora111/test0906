package Inheritance1;


class Samosa{
	void eat()
	{
		System.out.println("This is Samosa ");
	}
}
class Drink extends Samosa{
	
	void lassi()
	{
		System.out.println("this is Lassi");
	}
}
class ColdDrink extends Samosa{
	
	void Cold()
	{
		System.out.println("This is ColdDrink");
	}
}


public class HierarchyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drink DD1= new Drink();
		DD1.eat();
		DD1.lassi();
		
		ColdDrink CD1 = new ColdDrink();
		CD1.eat();
		CD1.Cold();

	}

}
