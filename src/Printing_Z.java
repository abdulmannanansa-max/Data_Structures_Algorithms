import java.util.Scanner;

public class Printing_Z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n - 2;

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = m; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
