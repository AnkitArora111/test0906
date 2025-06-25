package junePractice;

public class BoolenaDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isStudent = true;
		boolean hasLicense = false;
		
		System.out.println("Is the Person a student " +isStudent );
		System.out.println("Is the Person has License " +hasLicense );
		
		if(isStudent)
		{
			System.out.println("Eligible for student discount. ");
		}
		else
		{
			System.out.println("Not Eligible to drive");
		}

			// to print "Not eligible to drive" only when both conditions are false — that is:
			//
			//The person is not a student, and
			//
			//The person does not have a license.
	}

}
