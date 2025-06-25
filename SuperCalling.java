package junePractice;

class GrowInvestment{
	
	GrowInvestment(String a) 
	{
		System.out.println("GrowInvestment investment");
		
	}
}
class GoldInvestment extends GrowInvestment{
	
	GoldInvestment(){
		super("Ram");
		System.out.println("GoldInvestment Investment");
	}
}

public class SuperCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GoldInvestment();
	}

}
