import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
//        Effective but not efficient
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int star = 1;

        String[][] arrow =  new String[n][n];

        for (int i = 0; i < arrow.length; i++) {
            for (int j = 0; j < arrow.length ; j++) {

                if (j == n/2  ||  i == n/2 || i > 0 && i < n/2 && j > n/2 && j < star + (n/2) ){
                    arrow[i][j] = "*\t";
                }

                else if ( i < n - 1 && i > n/2 && j > n/2 && j < (n/2) + star - 1 ) {
                        arrow[i][j] = "*\t";
                        star--;
                }
                else arrow[i][j] = "\t";
            }
            star++;
        }

        for (int i = 0; i < arrow.length; i++) {
            for (int j = 0; j < arrow.length; j++) {
                System.out.print(arrow[i][j]);
            }
            System.out.println();
        }
    }
}
