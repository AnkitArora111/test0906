package abstraction;

abstract class google_auth
{
	abstract void login();
	abstract void logout();
}
public class AbstractMethod extends google_auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractMethod obj = new AbstractMethod();//
	        obj.login();
	        obj.logout();

	}

	void login() {
		// TODO Auto-generated method stub
		System.out.println("real logic");
	}

	void logout() {
 
		System.out.println("real Logic");
		
	}

}
