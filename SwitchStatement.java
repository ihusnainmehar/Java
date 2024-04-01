import java.util.Scanner;

public class SwitchStatement {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First No: ");
        int a = sc.nextInt();
        System.out.println("Enter Your Second No: ");
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4: if (b==0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(a/b);
            };
            break;
            case 5: if (b==0) {
                System.out.println("Invalid Division");
                } else {
                    System.out.println(a%b);
                }
                ;
                break;
                default: System.out.println("Invalid Operator");
        }
    }
}
