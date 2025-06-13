package javaPackage;

public class AdderPolymorphism {

	int a = 10;
	int b = 20;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int x, int y) {   //Same parameter
		System.out.println(x + y);
	}

	void sum(int x, double y) {   //diff parameter
		System.out.println(x + y);
	}

	void sum(double x, int y) {  //parameter same but serial is different
		System.out.println(x + y);
	}

	void sum(int x, int y, int c) {  //Three parameter
		System.out.println(x + y + c);
	}

}
