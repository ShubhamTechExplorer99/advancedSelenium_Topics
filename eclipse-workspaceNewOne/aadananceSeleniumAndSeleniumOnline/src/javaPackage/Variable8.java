package javaPackage;

public class Variable8 {

	int b = 10; // global variable
	static int c = 5; // static variable

	public static void main(String[] args) {

		int a = 6; // local variable
		System.out.println(a); // 6-Calling a variable

		// static member calling
		System.out.println(c);
		
		d();//15

		// Non static member calling
		Variable8 v8 = new Variable8();
		System.out.println(v8.b);
		v8.f(); //5

	}

	// static method
	public static void d() {
		int e = 15;
		System.out.println(e); //15
	}

	// Non static method
	public void f() {
		int g = 5;
		System.out.println(g); //5
	}

}
