import java.util.Scanner;

public class Q1 {
    // Question -- Print counting from 1 to n

    static void main() {
        System.out.print("Please enter your preferred range (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
