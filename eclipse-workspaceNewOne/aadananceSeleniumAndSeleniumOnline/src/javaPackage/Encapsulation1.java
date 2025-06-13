package javaPackage;

public class Encapsulation1 {

	String name; // Global variable
	int b; // Global variable
	final int c = 2; // Final variable

	public void a() {

		// c=10; = final variable can not change the value

	}

	// final method
	final void d() {
		System.out.println("Final Method");
	}

	//// Getter setter method
	public void setName(String s) {
		this.name = s;
		this.b = 5;
		System.out.println(b);// 5
		System.out.println(c);// 2

	}

	public String getName() {
		return name;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
