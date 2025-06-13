package javaPackage;

public class StaticKeywords {

	// static keywords can be applied for variables and methods
	// common data
	// static method and variables -without creating any object we can callsed
	// directly

	static int a = 10; // static variable
	int b = 20; // Nom static variable

	static void m1() {
		System.out.println("Thos is m1 static methods");
	}

	void m2() {
		System.out.println("This is Non static m2 methods");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {

		// static method and variables - without creating object
		m1();
		System.out.println(a);
		// m2(); //cannot access because m2() is a non static

		StaticKeywords sk = new StaticKeywords();
		sk.m2();
		sk.m1();
		System.out.println(sk.a);
		
		sk.m();

	}

}
