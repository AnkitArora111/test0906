package methodOverriding;

class WWE{
	
	void fight()
	{
		System.out.println("Welcome to world of fight");
	}
}

class players extends WWE{
	
	void fight()
	{
		super.fight();
		System.out.println("Players Here for fight only");
	}
}

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		players WE = new players();
		WE.fight();
		

	}

}
