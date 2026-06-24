import java.util.Scanner;

public class Any_Base_to_Decimal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        System.out.print("Enter base: ");
        int b = in.nextInt();

        int num = 0;

        for (int i = 0; n != 0; i++, n /= 10) {
            num += (int) ((n % 10) * Math.pow(b, i));
        }

        System.out.print("Decimal equivalent: "+num);
    }
}
