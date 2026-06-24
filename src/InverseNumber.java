import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int inverse = 0, position, digit, count = 0 ;

        while(n > 0) {
            digit = n % 10;
            count++;
            inverse += count * (int) Math.pow(10,digit-1);
            n /= 10;
        }
        System.out.println(inverse);
    }
}
