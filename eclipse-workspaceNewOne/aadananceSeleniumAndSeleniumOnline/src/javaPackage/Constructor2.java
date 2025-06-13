package javaPackage;

public class Constructor2 {

	int id; // Global variable
	String name; // Global variable
	String address; // Global variable

	// Default constructor
	Constructor2() {
		System.out.println("Hellow Default Constructor");
	}

	// Parametrized Constructor
	Constructor2(int a, String b, String c) {
		this.id = a;
		this.name = b;
		this.address = c;

	}

	// Non static method
	public void displayinfo() {
		System.out.println(id + " " + name + " " + address + " ");
	}

	public static void main(String[] args) {

		// Default constructor
		Constructor2 c2 = new Constructor2();

		// Parametrized Constructor
		Constructor2 c3 = new Constructor2(1, "Shubham", "Ambajogai");
		c3.displayinfo();

		Constructor2 c4 = new Constructor2(2, "Ganesh", "Latur");
		c4.displayinfo();

	}

}
