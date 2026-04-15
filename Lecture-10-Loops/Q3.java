import java.util.Scanner;

public class Q3 {
    // Question -- Print 10 multiples of n
    static void main() {
        System.out.print("Please enter a number of your choice (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
}
