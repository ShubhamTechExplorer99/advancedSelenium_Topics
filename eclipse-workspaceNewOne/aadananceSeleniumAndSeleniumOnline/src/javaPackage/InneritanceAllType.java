package javaPackage;

class A {
	int a = 100;

	void display() {
		System.out.println(a);
	}
}

class B extends A {

	int b = 200;

	void show() {
		System.out.println(b);
	}
}

class C extends B {
	int c = 300;

	void print() {
		System.out.println();
	}
}

public class InneritanceAllType {

	public static void main(String[] args) {

		//Single inneritance
		B bobj = new B();

		System.out.println(bobj.a);
		System.out.println(bobj.b);
		System.out.println();

		bobj.display();
		bobj.show();
		
		//Multilevel irritence
		C cobj = new C();
		System.out.println(cobj.c);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		
		cobj.print();

	}

}
