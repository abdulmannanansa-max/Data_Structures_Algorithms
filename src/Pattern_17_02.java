import java.util.Scanner;

public class Pattern_17_02 {
    public static void main(String[] args) {
//        Efficient method

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int space = n/2;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                if (i == 1 + n/2) {

                    System.out.print("*\t");
                } else {

                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= star; j++) {

                System.out.print("*\t");
            }

            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}
