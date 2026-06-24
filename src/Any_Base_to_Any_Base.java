import java.util.Scanner;

public class Any_Base_to_Any_Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        System.out.print("Enter base of n: ");
        int b1 = in.nextInt();

        System.out.print("Enter base of coversion: ");
        int b2 = in.nextInt();

        if (b1 == 10) {
            int num = 0;

            for (int i = 0; n != 0 ; i++,n /= b2) {
                num += (int) ((n % b2) * Math.pow(10,i));
            }
            System.out.println("Decimal equivalent: "+num);

        } else if (b2 == 10) {
            int num = 0;

            for (int i = 0; n != 0; i++, n /= 10) {
                num += (int) ((n % 10) * Math.pow(b1, i));
            }

            System.out.print("Decimal equivalent: "+num);
        }
    }
}
