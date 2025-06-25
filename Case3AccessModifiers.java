package examPactice;

import examTest.Case3Teacher;

public class Case3AccessModifiers extends Case3Teacher {

    public static void main(String[] args) {
        add();   // ✅ public – accessible anywhere

        sub();   // ✅ protected – accessible via inheritance in subclass

        // mul();  // ❌ default – NOT accessible outside package
        // div();  // ❌ private – NOT accessible anywhere outside class
    }
}
