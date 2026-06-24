import java.util.Scanner;

public class Pattern_13 {

    public static int fact(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Enter number of rows: ");
            num = in.nextInt();
        int n;

        for (n = 0; n < num; n++) {
            for (int i = 0; i <= n; i++) {

                    int result = fact(n)/(fact(i)*fact(n-i));
                    System.out.print(result+"\t");

            }
            System.out.println();
        }

    }
}
