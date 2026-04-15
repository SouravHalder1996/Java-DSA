import java.util.Scanner;

public class Pattern1 {
    /*
    Solid Square Pattern of size n

    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    
     */
    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
