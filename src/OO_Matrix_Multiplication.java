import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    // Constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Method to input matrix elements
    public void inputMatrix(Scanner sc) {
        System.out.println("Enter elements of " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Matrix multiplication
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Error! Multiplication not possible.");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                int sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }

        return result;
    }
}

public class OO_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows for Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int c2 = sc.nextInt();

        // Create Matrix objects
        Matrix mat1 = new Matrix(r1, c1);
        Matrix mat2 = new Matrix(r2, c2);

        // Input matrices
        System.out.println("\nMatrix 1:");
        mat1.inputMatrix(sc);

        System.out.println("\nMatrix 2:");
        mat2.inputMatrix(sc);

        // Print original matrices
        System.out.println("\nMatrix 1:");
        mat1.printMatrix();

        System.out.println("\nMatrix 2:");
        mat2.printMatrix();

        // Multiply
        Matrix result = mat1.multiply(mat2);

        // Print result
        if (result != null) {
            System.out.println("\nResult of Multiplication:");
            result.printMatrix();
        }

        sc.close();
    }
}
