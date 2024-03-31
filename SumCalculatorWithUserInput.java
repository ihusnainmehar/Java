import java.util.Scanner;

public class SumCalculatorWithUserInput {
    public static void main(String[] args) {
        try (// Sum Calculator with user input in java
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter your Second number: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("Sum: "+sum);
        }
    }
}
