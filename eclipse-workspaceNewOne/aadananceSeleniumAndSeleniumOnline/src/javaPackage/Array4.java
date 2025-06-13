package javaPackage;

public class Array4 {

	public static void main(String[] args) {

		// Defining Multi diamension array
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// Total number of row
		int row = a.length; // length is the property of an array
		System.out.println(row); // 3

		// Total number of columns
		int column = a[0].length;
		System.out.println("The position of array : "+ a[0][1]);
		System.out.println(column);// 4

		// Print all the value - matrix form
		// outer loop

		for (int i = 0; i < row; i++) {

			// inner loop
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
