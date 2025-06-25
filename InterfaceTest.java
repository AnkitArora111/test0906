package interfaceTest;

interface game{
	
	public void Mario();
}
class outdoor implements game{
	
	public void Mario() {
		System.out.println("Final Level Game");
	}
}
class Indoor implements game{
	
	public void Mario() {
		System.out.println("Game Over");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		game g1= new outdoor();
		game g2 = new Indoor();
		g1.Mario();
		g2.Mario();
		

	}

}
