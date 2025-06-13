package javaPackage;

public class Array1 {

	public static void main(String[] args) {

		// Declearing the array
		int a[] = new int[5];

		// printing the length of the array
		System.out.println(a.length);

		// print the default value of an integer array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Assiging the value of an array
		a[0] = 100;
		a[1] = 200;
		a[3] = 300;
		a[4] = 400;

		// a[5]=500; //java.lang.ArrayIndexOutOfBoundsException

		System.out.println(a[3]);

		// print all the value of an element
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
