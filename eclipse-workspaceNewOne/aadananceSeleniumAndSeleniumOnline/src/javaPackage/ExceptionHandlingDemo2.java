package javaPackage;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {

		System.out.println("Program is started....");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		try {
			System.out.println(100 / num);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Invalid Data  ...Please Enter valid input ");
		}

		System.out.println("Program is completed...");
		System.out.println("Program is exited....");

	}

}
