import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        System.out.print("Enter 1 digit number: ");
        int num = in.nextInt();

        int count = 0;

        while (n > 0){

            int dig = n % 10;

            n /= 10;

            if (dig == num) {
                count++;
            }
        }
        System.out.println("Frequency: "+count);
    }
}
