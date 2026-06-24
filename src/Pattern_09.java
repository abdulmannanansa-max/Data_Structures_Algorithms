import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[][] star = new String[n][n];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star.length; j++) {
                if (i == j || i + j + 1 == n) {
                    star[i][j] = "*";
                }
                else star[i][j] = " ";
            }
        }

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star.length; j++) {
                System.out.print(star[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
