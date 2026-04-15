import java.util.Scanner;

public class Pattern15 {
    /*
    Print this pattern

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

     */

    static void main() {
        System.out.print("Please enter the length(n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
