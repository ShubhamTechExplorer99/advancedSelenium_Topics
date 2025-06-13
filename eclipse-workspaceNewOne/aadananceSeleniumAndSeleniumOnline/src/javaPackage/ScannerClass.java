package javaPackage;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		System.out.println("Your Entered Number is : "+number);

		System.out.println("Enter a city : ");
		String city = sc.next();
		System.out.println("Your city is : " + city);

	}

}
