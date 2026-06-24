import java.util.Scanner;

public class Pattern_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int space, star, i, j, k, n;

        System.out.print("Enter n: ");
        n = in.nextInt();

        /*      IF n = 5
        * * *  * * *
        * *      * *
        *          *
        * *      * *
        * * *  * * *

        * * * *  * * * *
        * * *      * * *
        * *          * *
        *              *

         */
        star = 1 + n/2;

        for ( i = 0; i < star; i++) {
            System.out.print("*");
            star--;
        }
    }
}
