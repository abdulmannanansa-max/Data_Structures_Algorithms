import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 2; i * i < n; i++) {
            System.out.println(i*i);
        }
    }
}
