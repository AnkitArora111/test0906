package Inheritance1;

// Parent class (Super class)
class shape {
    
    // Common method for all shapes
    void draw() {
        System.out.println("Drawing the shape");
    }
}

// Child class 1 inheriting from shape
class circle extends shape {
    
    // Method specific to circle
    void calculate(double radius)
    {
    	double area1 = Math.PI*radius;
        System.out.println("Area of circle = " + area1);
    }
}

// Child class 2 inheriting from shape
class Square extends shape {
    
    // Method specific to square
    void CalArea(double side) {
    	double area = side * side;
        System.out.println("Area of circle = " + area);
    }
}

// Main class
public class HierarchyLevel {

    public static void main(String[] args) {
        
        // Creating object of circle class
        circle cir = new circle();
        cir.draw();        // Inherited from shape
        cir.calculate(5.0);   // Own method

        // Creating object of Square class
        Square Sq = new Square();
        Sq.draw();         // Inherited from shape
        Sq.CalArea(4.0);      // Own method
    }
}
