// Package declaration
package Inheritance1;

// Grandparent class (Top-level parent)
class GrandParents {
    int a = 10;

    void display() {
        System.out.println("Value from GrandParents class: " + a);
    }
}

// Parent class inherits from GrandParents
class Par extends GrandParents {
    int b = 20;

    void show() {
        System.out.println("Value from Par class: " + b);
    }
}

// Child class inherits from Par (and indirectly from GrandParents)
class Chd extends Par {
    int c = 30;

    void print() {
        System.out.println("Value from Chd class: " + c);
    }
}

// Main class to run the program
public class multiLvel {
    public static void main(String[] args) {
    	
        // Creating an object of Chd (Child class)
    	
        Chd ch = new Chd();

        // Accessing methods from all three levels of inheritance
        ch.display(); // Method from GrandParents
        ch.show();    // Method from Par
        ch.print();   // Method from Child
    }
}
