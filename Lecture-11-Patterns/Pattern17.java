import java.util.Scanner;

public class Pattern17 {
    /*
    Print this pattern

    E
    E D
    E D C
    E D C B
    E D C B A

     */

    static void main() {
        System.out.print("Please enter the length(n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(65+n-j) + " ");
            }
            System.out.println();
        }
    }
}
