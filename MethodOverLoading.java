package junePractice;

public class MethodOverLoading {
	
	
//	public static int sum(int a ,int b)
//	{
//		return a+b;
//	}
//	public static int sum(int a ,int b,int c)
//	{
//		return a+b+c;
//	}
//
//	public static void main(String[] args) {
//		
//		System.out.println(sum(5,7));
//		System.out.println(sum(5,7,5));
//	}
//	
	public int sum(int a ,int b)
	{
		return a+b;
	}
	public int sum (int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		
        MethodOverLoading obj = new MethodOverLoading();
        
		int result1 =obj.sum(10,20);
		int result2 =obj.sum(10,20,30);
		System.out.println(result1);
		System.out.println(result2);
	}
}
