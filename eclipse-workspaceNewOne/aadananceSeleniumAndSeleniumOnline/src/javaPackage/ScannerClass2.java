package javaPackage;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firsr number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		System.out.println("Addition of two number : " + (num1 + num2));

	}

}
