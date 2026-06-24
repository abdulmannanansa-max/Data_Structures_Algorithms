import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int star = 1;
        int space = 2*n - 3;

        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int j = 0; j < star; j++) {

                System.out.print(value+"\t");

                    value++;
            }
            for (int j = 0; j < space; j++) {

                System.out.print("\t");
            }


            for (int j = 0; j < star ; j++) {
                if (star == n) {
                    star--;
                    value--;
                }

                    value--;
                    System.out.print(value+"\t");
            }

                star++;
                space -= 2;

                System.out.println();
//            }
        }


    }
}
