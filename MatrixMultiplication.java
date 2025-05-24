import java.util.Random;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків першої матриці: ");
        int rowsA = scanner.nextInt();

        System.out.print("Введіть кількість стовпців першої матриці: ");
        int colsA = scanner.nextInt();

        System.out.print("Введіть кількість рядків другої матриці: ");
        int rowsB = scanner.nextInt();

        System.out.print("Введіть кількість стовпців другої матриці: ");
        int colsB = scanner.nextInt();

        if (rowsA <= 0 || colsA <= 0 || rowsB <= 0 || colsB <= 0) {
            System.out.println("Розміри мають бути додатніми числами.");
            scanner.close();
            return;
        }

        if (colsA != rowsB) {
            System.out.println("Множення неможливе: кількість стовпців першої матриці має дорівнювати кількості рядків другої.");
            scanner.close();
            return;
        }

        double[][] A = new double[rowsA][colsA];
        double[][] B = new double[rowsB][colsB];
        double[][] C = new double[rowsA][colsB];

        Random rand = new Random();

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = rand.nextDouble();
            }
        }

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = rand.nextDouble();
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("Матриця A:");
        printMatrix(A);

        System.out.println("\nМатриця B:");
        printMatrix(B);

        System.out.println("\nРезультат множення (матриця C):");
        printMatrix(C);

        scanner.close();
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.4f ", val);
            }
            System.out.println();
        }
    }
}
