package junePractice;

public class LoginGmail1 {

    LoginGmail1() {
        this(100);
        System.out.println("1");
    }

    LoginGmail1(int a) {
        this("RAM"); // Now valid
        System.out.println("2");
    }

    LoginGmail1(String a) {
        System.out.println("String constructor: " + a);
    }

    void LoginGmaill(String a) {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new LoginGmail1();
    }
}
