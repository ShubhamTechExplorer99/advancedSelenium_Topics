package javaPackage;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Program is started....");

// Example 1

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter a Number : "); int num = sc.nextInt();
		 * System.out.println(100 / num); // ArithmeticException
		 */

// Example 2
		/*
		 * int a[] = new int[5]; System.out.println("Enter the position(0-4) : "); int
		 * pos = sc.nextInt();
		 * 
		 * System.out.println("Enter a value : "); int value = sc.nextInt();
		 * 
		 * a[pos] = value; //ArrayIndexOutOfBoundsException
		 * 
		 * System.out.println(a[pos]);
		 */

// Example 3
		/*
		 * String s = "Shubham"; //NumberFormatException int numb = Integer.parseInt(s);
		 * System.out.println(numb);
		 */
// Example 4	
		String s1 = null; 
		System.out.println(s1.length());  //NullPointerException

		
		
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited....");
	}

}
