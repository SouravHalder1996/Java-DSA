import java.util.Scanner;

public class Pattern16 {
    /*
    Print this pattern

    A
    A B
    A B C
    A B C D
    A B C D E

     */

    static void main() {
        System.out.print("Please enter the length(n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
