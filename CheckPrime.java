import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        
        if (n == 1) {
            System.out.println("Neither Prime nor Composite");
        } else {
            int c = 2;
            boolean isPrime = true;
            while (c * c <= n) {
                if (n % c == 0) {
                    isPrime = false;
                    break;
                }
                c++;
            }
            
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
