package Day3;

public class Finalvariables {
    
    final static double pivalue = Math.PI;
    
    static void area_of_circle() {
        int r = 10;
        double area = pivalue * r * r;
        System.out.println(area);
    }

    public static void main(String[] args) {
        area_of_circle();
   //     int a = 400;
    }
}
