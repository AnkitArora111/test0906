package interfaceTest;

interface shape1 {
    // Constants in interface (implicitly public, static, final)
    int length = 10;
    int width = 30;
    
    // Abstract method (must be implemented by implementing class)
    void circle();
    
    // Default method (introduced in Java 8, can have body)
    default void square() {
        System.out.println("this is Square - default method");
    }
    
    // Static method (must be called using interface name)
    static void rectangle() {
        System.out.println("this is rectangle - static method");
    }
}

// Class 'InterfaceDemo' implements the 'shape' interface
public class InterfaceDemo2 implements shape1 {

    // Implementation of abstract method from interface
    public void circle() {
        System.out.println("this is circle- Abstract method");
    }

    // Additional method defined in this class (not part of interface)
    void triangle() {
        System.out.println("this is triangle..");
    }



public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape1 sh1 = new InterfaceDemo2();
		sh1.circle();
		sh1.square();
		shape.rectangle();
		System.out.println(shape.length+shape.width);
	}

}
}
