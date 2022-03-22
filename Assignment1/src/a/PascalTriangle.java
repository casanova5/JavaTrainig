package a;
import java.util.Scanner;

public class PascalTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of pascal triangle");
		int n = sc.nextInt();
		sc.close();
		int[][] arr = new int[n][n];
		//print the pascal's triangle
	    PrintPascalTriangle(n, arr);
		
	}

	private static void PrintPascalTriangle(int n, int[][] arr) {
		for (int row = 0; row < n; row++)
	    {
	        for (int col = 0; col <= row; col++)
	        {
	        // First and last column in every row are 1
	        if (row == col || col == 0)
	            arr[row][col] = 1;
	        // Other cells are sum of values just above
	        else
	            arr[row][col] = arr[row - 1][col - 1] +
	                            arr[row - 1][col];
	        System.out.print(arr[row][col]+" ");
	        }
	        System.out.println(" ");
	        
	    }
	}
}
