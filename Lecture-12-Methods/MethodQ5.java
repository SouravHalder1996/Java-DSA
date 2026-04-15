import java.util.Scanner;

public class MethodQ5 {
    // Create a method calculatePercentage(int obtained, int total).
    static void calculatePercentage(int obtained, int total){
        float percent = ((float)obtained / (float)total)*100;
        System.out.println("Calculated Percentage: " + percent + "%");
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Obtained: ");
        int obtained = sc.nextInt();
        System.out.print("Total: ");
        int total = sc.nextInt();

        calculatePercentage(obtained, total);

    }
}
