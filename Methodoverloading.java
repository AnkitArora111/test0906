package Day3;

public class Methodoverloading {
	
	
	static void add(int a ,double b)
			{
				double sum = a+b;
				System.out.println(sum);
			}
			
	static void add(double a ,int b,int c)
	{
		double sum = a+b+c;
		System.out.println(sum);
	}
	static void add(double a ,int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
