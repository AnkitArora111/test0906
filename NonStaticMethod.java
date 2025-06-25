package examPactice;

public class NonStaticMethod {
	
	//Nonstatic can called by its name 
			//by creating an object
			//Syntax - Classname variable = new Classname();
			//variable.nonstaticMethod();
//	You must create an object of the class to call it.

	void add(){
	
	int a =10;
	int b =20;
	int c = a+b;
	System.out.println(c);
	
	}
	
	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName();
		NonStaticMethod sum = new NonStaticMethod();
		sum.add();
	}

}
