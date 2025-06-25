package examTest;

public class TypeCasting {

	public static void main(String[] args) {
		
// process of downsizing a bigger data type into a smaller one is known as narrowing type casting.
//		 Narrowing (Explicit)
//		 Must be done manually by the programmer.
//
//		 Converts larger data types to smaller ones.
//
//		 May result in data loss.

		double x = 9.78;
		int K =(int)x;
		short Z = (short)x;
		System.out.println("After Type Casting to int " + K);
		System.out.println("After Type Casting to int " + Z);

	}

}
