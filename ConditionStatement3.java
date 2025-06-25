package examPactice;

public class ConditionStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int age = 22;
	     boolean passedVisionTest = true;
	        
		 if (age >= 18) {
	            System.out.println("Age requirement met.");

	            if (passedVisionTest) {
	                System.out.println("Eligible for a driving license.");
	            } else {
	                System.out.println("Failed vision test. Not eligible.");
	            }

	        } else {
	            System.out.println("Too young for a driving license.");

	}
	}
}
