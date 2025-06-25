package StringTest;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = new StringBuffer(200);
        sb.append("World"); // Will print: Hello
        System.out.println(sb);
        char ch1=sb.charAt(1);
        System.out.println(ch1);
        String ch2 =sb.reverse();
        
        
    }
}
