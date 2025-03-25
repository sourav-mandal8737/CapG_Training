package TwoD_Array;
import java.util.Scanner;

public class Greatest_element {
    public static void main(String[] args) {
        createElement();
    }

    public static void createElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int greatest = findGreatestElement(arr);
        System.out.println("The greatest element in the 2D array is: " + greatest);

        if (isSymmetric(arr)) {
            System.out.println("The array is symmetric.");
        } else {
            System.out.println("The array is not symmetric.");
        }

        sc.close();
    }
    public static int findGreatestElement(int[][] arr) {
        int max = arr[0][0];  

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    public static boolean isSymmetric(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        
        if (rows != cols) {
            return false;
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

