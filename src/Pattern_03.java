import java.util.Scanner;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int space = n-1;
        int star = 1;

//        Pattern 3
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star ; j++) {
                System.out.print("*");
            }
            space--;
            star++;
            System.out.println();
        }

        space = 1;
        star = n;

//        Pattern 4
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }

            space++;
            star--;
            System.out.println();
        }
    }
}
