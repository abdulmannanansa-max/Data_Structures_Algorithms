import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int star = n;
        int space = 0;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= space; j++) {

                System.out.print("\t");

            }

            for (int j = 1; j <= star ; j++) {

                if (i <= n/2 && i > 1 && j > 1 && j < star) {

                    System.out.print("\t");

                } else System.out.print("*\t");

            }
                if (i <= n/2) {

                    space++;
                    star -= 2;

                } else {

                    space--;
                    star += 2;

                }

            System.out.println();
        }

    }
    }

