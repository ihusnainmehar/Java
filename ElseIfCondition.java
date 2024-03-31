import java.util.Scanner;

public class ElseIfCondition {
    public static void main(String args[]) {
        //We are using Else if Statement here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println(" a is lesser than b");
        }
    }
}
