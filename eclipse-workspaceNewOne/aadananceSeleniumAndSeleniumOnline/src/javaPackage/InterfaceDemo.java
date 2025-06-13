package javaPackage;

import java.awt.Rectangle;

interface Shape {
	int length = 10; // final and static by default
	int width = 20; // final and static by default

	void circle(); // abstract mnethods

	default void square() {
		System.out.println("This is a Square  ---default method");
	}

	static void rectangle() {
		System.out.println("This is Rectangle ---static methods");
	}
}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("This is circle - abstract methods");

	}

	void triangle() {
		System.out.println("This is triangle");
	}
	
	int x=100,y=200;

	public static void main(String[] args) {

		// Scenario - 1
		InterfaceDemo i = new InterfaceDemo();
		i.circle(); // abstract
		i.square(); // default

		i.triangle();
		System.out.println(i.x * i.y);

		Shape.rectangle();// static method can directly access from interface

		// Scenario - 2

		Shape sh = new InterfaceDemo(); // Parent child create object
		sh.circle(); // abstract
		sh.square(); // default
		Shape.rectangle(); // static method can directy access from interface

		//sh.triangle(); we cannot access
		System.out.println(Shape.length * Shape.width); //static variable access directly
	
		//System.out.println(sh.x * sh.y);we cannot access	
	
	}

}
