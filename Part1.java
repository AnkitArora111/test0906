package methodOverriding;

// Parent class
class Parentsclass {
    
    // Method to be overridden
    void login() {
        System.out.println("Login with the mobile no");
    }
}

// Child class inheriting from Parentsclass
class childclass extends Parentsclass {
    
    // Overriding the login() method from the parent class
    void login() {
        super.login();  // Optional: Call parent class version first//to avoid the method overriding 
        System.out.println("Login with Email Id");  // New behavior
    }
}

// Main class with main() method
public class Part1 {

    public static void main(String[] args) {

        // Creating object of child class
        childclass cc = new childclass();

        // Calls the overridden method in child class
        cc.login();

        /*
         * Concept Notes:
         * - Defining a method in the child class with the same name and parameters as the parent class, but with a different implementation.
         * - The method must have:
         *     → The same name
         *     → The same return type
         *     → The same parameter list (signature)
         * - The two classes must have an inheritance relationship.
         * - In Java, only non-static methods can be overridden.
         * - 'super.login()' allows us to call the parent class version of the method if needed.
         */
    }
}
