import java.util.Scanner;

public class Pattern19 {
    /*
    Print this pattern

          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1

     */

    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = (i-1); j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
