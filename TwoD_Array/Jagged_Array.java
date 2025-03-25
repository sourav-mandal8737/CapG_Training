package TwoD_Array;

import java.util.Scanner;

public class Jagged_Array {

    public static void main(String[] args) {
        createJaggedArray();
    }

    public static void createJaggedArray() {
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            
            jaggedArray[i] = new int[cols];
            
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for [" + (i + 1) + "][" + (j + 1) + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        
        sc.close();  

        System.out.println("\nJagged Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
