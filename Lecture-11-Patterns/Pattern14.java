import java.util.Scanner;

public class Pattern14 {
    /*
    Print this pattern

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    static void main() {
        System.out.print("Please enter the length(n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
