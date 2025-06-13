package javaPackage;

public class FirstJavaProgram {

	int a = 5; // global varibles
	static int b = 10; // static variables

	public static void main(String[] args) {

		System.out.println("Hellow");
		System.out.println("Shubham");
		aMethod(); // calling methods
		bMethod(); // calling methods
		int d = 20; // local variables
		System.out.println("Value of d : " + d); // calling a variables
		System.out.println("value of b : " + b); // calling a variables
	}

	// User Defined Methods
	public static void aMethod() {

		System.out.println("a methods called");
	}

	public static void bMethod() {

		System.out.println("b methods called");

		int c = 15; // local variables
		System.out.println("Value of c : " + c);
	}

}
