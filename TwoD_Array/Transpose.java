package TwoD_Array;

import java.util.Scanner;

public class Transpose {
	
    public static void main(String[] args) {
        CreateArray();
    }

    public static int[][] transposeArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void CreateArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Array:");
        printArray(arr);

        int[][] transposedArray = transposeArray(arr);

        System.out.println("Transposed Array:");
        printArray(transposedArray);
        scanner.close();
    }
}
