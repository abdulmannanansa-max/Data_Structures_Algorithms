import java.util.Scanner;

public class Diff_Array {
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

        int[] diff = new int[m];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0){
            int d = 0;

            int val = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + carry >= val) {
                    d = arr2[j] + carry - val;
                    carry = 0;

                }else {
                    d = arr2[j] + carry + 10 - val;
                    carry = -1;
                }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length){
            if (diff[idx] == 0) {
                idx++;
            } else break;
        }

        while (idx < diff.length){
            System.out.print(diff[idx]);
            idx++;
        }


    }
}
