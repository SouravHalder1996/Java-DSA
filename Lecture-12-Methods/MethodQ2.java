import java.util.Scanner;

public class MethodQ2 {
    // Create a method add(int a, int b) that returns the sum.
    static int add(int a, int b){
        return a+b;
    }
    static void main() {
        System.out.println("Please enter two numbers you want to add: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }
}
