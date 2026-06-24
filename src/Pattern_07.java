import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[][] star = new String[n][n];

        /*      if n = 5
        *
            *
                *
                    *
                        *
        */

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star.length; j++) {
                if (i == j) {

                    star[i][j] = "*";
                }
                else
                    star[i][j] = " ";
            }
        }


        for (String[] strings : star) {
            for (int j = 0; j < star.length; j++) {
                System.out.print(strings[j] + "\t");
            }
            System.out.println();
        }
    }
}
