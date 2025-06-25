package examTest;

class GoogleProblem {
    void add() {
        System.out.println("Add method in GoogleProblem");
    }

    void sub() {
        System.out.println("Sub method in GoogleProblem");
    }
}

public class Upcasting extends GoogleProblem {
    void mul() {
        System.out.println("Mul method in Uptest");
    }

    void div() {
        System.out.println("Div method in Uptest");
    }

    public static void main(String[] args) {
        // Upcasting
        GoogleProblem g1 = new Upcasting();

        // Only methods from GoogleProblem (superclass) are accessible
        g1.add();
        g1.sub();

        GoogleProblem g2 = (GoogleProblem) new Upcasting();
        
    }
}
