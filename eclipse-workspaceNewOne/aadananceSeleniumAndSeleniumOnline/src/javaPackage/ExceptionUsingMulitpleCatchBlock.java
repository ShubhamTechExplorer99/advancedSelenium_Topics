package javaPackage;

import java.util.Scanner;

public class ExceptionUsingMulitpleCatchBlock {
	
	public static void main(String[] args) {
		
		System.out.println("Program is started....");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		try {
			System.out.println(100 / num);
		} 
		/*
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Getting ArithmeticException ");
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Getting NullPointerException ");
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Getting IndexOutOfBoundsException ");
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Getting NumberFormatException0 ");
		}
		*/
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

		System.out.println("Program is completed...");
		System.out.println("Program is exited....");
	}

}
