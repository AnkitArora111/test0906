package examTest;

//case 1
//What happens within the class?

public class AccessModifiers {

public static void add()
{
	System.out.println("Print Add");
}
private static void sub()
{
	System.out.println("Print Sub");	
}

static void mul()
{
	System.out.println("Print mul");
}
protected static void div()
{
	System.out.println("Print div");
}

public static void main(String[] args) {
	
	add();
	sub();
	mul();
	div();
}
}

