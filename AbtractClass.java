package junePractice;

public class AbtractClass {
	
static abstract class Shape
	{
	abstract void draw();	
	
	void displayType() {
		System.out.println("this is a shape");
	}
	}
static class Circle extends Shape{
	
	void draw() {
		System.out.println("Drawing the circle");
	}
}
static class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing the Rectangle");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle();
		s1.draw();
		
		Shape s2= new Rectangle();
		s2.draw();
		

		
	}

	}

