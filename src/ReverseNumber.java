import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = n;

            while (t != 0) {
                System.out.print(t%10);
                t /= 10;
            }

    }
}
