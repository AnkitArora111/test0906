package arraysOne;

public class HowManyTimesNumberRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,20,30,40,50,10,20};
		
		int num =10;
		int count =0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("number of times repeated :" +count);
	}

}
