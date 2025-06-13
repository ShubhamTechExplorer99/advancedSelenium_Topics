package javaPackage;

public class JavaMethodMain {

	public static void main(String[] args) {

		JavaMethods jm = new JavaMethods();
		jm.m1(); // invoke the method in main method throught the object

		String s = jm.m2();
		System.out.println(s);

		jm.m3("Shubham");

		String m4 = jm.m4("Shubham", 10);
		System.out.println(m4);

	}

}
