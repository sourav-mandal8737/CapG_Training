/*package TwoD_Array;
import java.util.Arrays;
import java.util.Scanner;
public class Twod_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m=sc.nextInt();
		System.out.println("Enter number of columns");
		int n=sc.nextInt();
		int [][] arr=new int[m][n];
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
		
		sc.close();
	}

}*/






package TwoD_Array;
import java.util.Scanner;

public class Twod_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        
        System.out.println("Enter the elements");
        for (int[] row : arr) {
            for (int j = 0; j < n; j++) {
                row[j] = sc.nextInt();
            }
        }

        System.out.println("Array elements:");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
