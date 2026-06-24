import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
