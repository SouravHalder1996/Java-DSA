import java.util.Scanner;

public class Pattern20 {
    /*
    Print this pattern

          1
        2 2 2
      3 3 3 3 3
    4 4 4 4 4 4 4

     */

    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
