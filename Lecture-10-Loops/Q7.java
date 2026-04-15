import java.util.Scanner;

public class Q7 {
    // Question -- Print the sum of all the numbers between 1 to n

    static void main() {
        System.out.print("Please enter your preferred range (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
