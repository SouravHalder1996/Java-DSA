import java.util.Scanner;

public class MethodQ4 {
    // Create a method getMaximum(int a, int b) that returns the larger number.

    static int getMaximum(int a, int b){
        return a > b ? a : b;
    }

    static void main() {
        System.out.println("Please enter two numbers among which you want to get the larger: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Larger Number is: " + getMaximum(a, b));
    }
}
