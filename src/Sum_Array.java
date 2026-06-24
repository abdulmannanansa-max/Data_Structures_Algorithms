import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter m: ");
        int m = in.nextInt();

        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            arr2[i] = in.nextInt();
        }

        int[] sum = new int[n > m ? n : m];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0){
            int d = carry;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            carry = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry);
        }
        for (int val : sum){
            System.out.print(val);
        }
    }
}
