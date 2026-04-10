import java.util.Scanner;

public class Q2 {
    // Question -- Print counting from n to 1

    static void main() {
        System.out.print("Please enter your preferred range (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
