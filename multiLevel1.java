package Inheritance1;

class Mango{

int a = 30;
void eat()
{
	System.out.println(a);
	
}
}
class Apple extends Mango{
	
	int b = 40;
	void run()
	{
		System.out.println(b);
	}
}

class tomato extends Apple{
	
	int c = 50;
	void grow()
	{
		System.out.println(c);
	}
}
		
public class multiLevel1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		 tomato tp = new tomato();  
		tp.run();
		tp.eat();
		tp.grow();
	}

}
