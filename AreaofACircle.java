import java.util.Scanner;

public class AreaofACircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double pi = 22.0/7;
        double a = pi * (r*r);
        System.out.println("Area of circle is = "+a);
    }
}
