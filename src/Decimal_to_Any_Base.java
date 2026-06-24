import java.util.Scanner;

public class Decimal_to_Any_Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Not for Hexadecimal with alphabets...

        System.out.print("Enter a decimal number: ");
        int n = in.nextInt();

        System.out.print("Enter another base: ");
        int b = in.nextInt();

        int num = 0;

        for (int i = 0; n != 0 ; i++,n /= b) {
            num += (int) ((n % b) * Math.pow(10,i));
        }
        System.out.println(num);
    }
}
