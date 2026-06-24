import java.util.Scanner;

public class Pattern_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, i, j, space, star;

        n = in.nextInt();

        /*    If n = 3
          *
         * *
        * * *
         * *
          *      */

        space = n - 1;
        star = 1;

        for ( i = 0; i < n; i++) {

            for (j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (j = 0; j < star; j++) {
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }

        space = 1;
        star = n - 1;

        for ( i = 0; i < n; i++) {

            for (j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < star; j++) {
                System.out.print("* ");
            }

            star--;
            space++;
            System.out.println();
        }


    }
}
