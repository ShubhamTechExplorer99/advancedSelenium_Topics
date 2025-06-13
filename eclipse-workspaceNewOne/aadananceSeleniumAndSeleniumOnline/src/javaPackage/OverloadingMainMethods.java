package javaPackage;

public class OverloadingMainMethods {

	// Can we overloaded main methods? -->Yes,We can oerverloaded the main methods

	void main(int x) {
		System.out.println(x);
	}

	void main(String s) {
		System.out.println(s);
	}

	void main(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public static void main(String[] args) {

		OverloadingMainMethods od = new OverloadingMainMethods();
		od.main(10);
		od.main("Hellow");
		od.main("Welcome to", "Java");

	}

}
