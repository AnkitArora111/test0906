package arraysOne;

public class NumberOfEvenOldNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,33,10,22,13,30};
		int even=0;
		int odd =0;
		
		for(int value:a)
		{
			if(value%2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Number of even Number: "+even);
		System.out.println("Number of odd Number: "+odd);

	}

}
