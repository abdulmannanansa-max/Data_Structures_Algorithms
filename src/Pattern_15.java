import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int star, space;

        space = n/2;
        star = 1;
        int value = 1;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            int row = value;

            for (int j = 1; j <= star; j++) {
                System.out.print(row + "\t");


                if (j <= star/2) {
                    row++;
                }else {
                    row--;
                }
            }

            if (i <= n/2) {
                space--;
                star += 2;
                value++;
            }else {
                space++;
                star -= 2;
                value--;
            }


            System.out.println();


        }
    }
}
