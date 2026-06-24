import java.util.Scanner;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();
        int max, star, space;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            arr[i] = in.nextInt();
        }

        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = max; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i) {
                    System.out.print("*\t");
                } else System.out.print("\t");
            }

            System.out.println();
        }
    }
}
