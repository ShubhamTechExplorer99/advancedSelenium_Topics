package javaPackage;

import java.util.Arrays;


public class ArrayProgramSortingtheElemengt {

	public static void main(String[] args) {

		int a[] = { 100, 600, 200, 500, 400 };

		System.out.println("Before sorting : ");

		System.out.println(Arrays.toString(a)); // short for to print the all element in the array

		Arrays.sort(a);

		System.out.println("After sorting : ");

		System.out.println(Arrays.toString(a));

	}

}
