package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {

		int age = 15; // loacal variable
		int weight = 55; // local variable

		//Outer If statement
		if (age > 18) {

			//Inner If statement
			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		}

		else {
			System.out.println("Age is not greater than 18");
		}

	}

}
