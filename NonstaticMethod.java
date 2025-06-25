package Day2;

public class NonstaticMethod {
	
	void login() {
		System.out.println("login to Amazon");
	}
	void logout() {
		
		System.out.println("Loout from Amazon");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nonstatic can called by its name 
		//by creating an object
		//Syntax - Classname variable = new Classname();
		//variable.nonstaticMethod();
		
		
		NonstaticMethod a1 = new NonstaticMethod();
		a1.login();
		a1.logout();

	}
	

}
