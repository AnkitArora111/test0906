package junePractice;

public class LocalVariables {
    
    // 🔹 Static (Global) variable - shared by all instances of the class
    static String name = "Rahul";
    
    // 🔹 Static Final variable - constant value that cannot be changed
    final static int b = 99;
    

    public static void main(String[] args) {
        // 🔹 Local variables - declared inside the main method
        int a = 200;
   
        // Printing local variable
        System.out.println(a);

        // Accessing static (global) variable
        System.out.println(name);

        // Accessing static final variable (constant)
        System.out.println(b);

//        | **Variable** | **Type**               | **Declared In**                   | **Scope**                                 | **Accessible In `main()`** | **Default Value** |
//        | ------------ | ---------------------- | --------------------------------- | ----------------------------------------- | -------------------------- | ----------------- |
//        | `a`          | 🔹 **Local Variable**  | Inside `main()` method            | Only within `main()`                      | ✅ Yes                      | ❌ Must initialize |
//        | `name`       | 🔹 **Static (Global)** | Inside class, with `static`       | Entire class (shared among all instances) | ✅ Yes                      | ✅ "Rahul"         |
//        | `b`          | 🔹 **Static Final**    | Inside class, with `static final` | Entire class (constant value)             | ✅ Yes                      | ✅ 99              |

    }
}
