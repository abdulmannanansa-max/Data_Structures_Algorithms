import java.util.Scanner;

public class Matrix_Multiplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int r1, c1, r2, c2;

        System.out.println("Enter row 1: ");
        r1 = in.nextInt();

        System.out.println("Enter column 1: ");
        c1 = in.nextInt();

        System.out.println("Enter row 2: ");
        r2 = in.nextInt();

        System.out.println("Enter column 2: ");
        c2 = in.nextInt();

        if (c1 != r2) {
            System.out.println("Error! multiplication not possible");
        }else{
            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            int[][] result = new int[r1][c2];

            System.out.println("\nMatrix 1: \n");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.println("Enter element ("+(i+1)+","+(j+1)+")");

                    mat1[i][j] = in.nextInt();
                }
                System.out.println();
            }

            System.out.println("Matrix 2: \n");

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.println("Enter element ("+(i+1)+","+(j+1)+")");

                    mat2[i][j] = in.nextInt();
                }
                System.out.println();
            }

            System.out.println("Original Matrices...\n");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(mat1[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mat2[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {

                    for (int k = 0; k < c1; k++) {

                        result[i][j] += (mat1[i][k] * mat2[k][j]);
                    }
                }
            }

            System.out.println("\nResult Matrix: \n");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }

        }
        in.close();
    }
}
