package javaPackage;

public class ConstructorDemo {

	int x, y;

	ConstructorDemo() { // Default Constructor
		x = 100;
		y = 200;

	}

	ConstructorDemo(int a, int b) { // Parametrized constructor
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo(); // invoke default constructor
		cd.sum();

		ConstructorDemo ce = new ConstructorDemo(10, 20); // invoke parametrized constructor
		ce.sum();

	}

}
