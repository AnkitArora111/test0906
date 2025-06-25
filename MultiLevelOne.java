package Inheritance1;

class Father{

	int a = 66; 

	void Flat()
	{
        System.out.println("Value from father class: " + a);

	}
}
class Brother extends Father{
	
	int b =30;
	
	void Ps5() {
        System.out.println("Value from brother class: " + b);

	}
}
class Rahul extends Brother{
	
	int c = 15;
	void study() {
		System.out.println("Value from Rahul class:   "+c);
	}
}

public class MultiLevelOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul R1 =new Rahul();
		R1.Flat();
		R1.Ps5();
		R1.study();

	}

}
