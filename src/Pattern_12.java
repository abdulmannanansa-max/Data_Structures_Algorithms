import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("ENTER n: ");

        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num1+"\t");
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }

            System.out.println();
        }


    }
}
