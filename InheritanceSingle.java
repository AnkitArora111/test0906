package junePractice;


	
	class School{
	
	void play()
	{
		System.out.println("This is my School");
		
		
	}
	}
	class Boy extends School{
		
		void ground() 
		{
			System.out.println("This is PlayGround");
		}
			
	}
	public class InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boy b1 = new Boy();
		b1.ground();
		b1.play();

	}

}
