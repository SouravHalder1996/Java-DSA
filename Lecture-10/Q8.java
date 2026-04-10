public class Q8 {
    // Question -- Print all integers in range from 50 to 100, that are perfectly divisible by 7
    static void main() {
        for (int i = 50; i <= 100 ; i++) {
            if(i%7 == 0){
                System.out.println(i);
            }
        }
    }
}
