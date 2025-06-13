package javaPackage;

public class Array2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, };// Defining int array

		String s[] = { "Hi", "Hello" };// Defining String array

		Object b[] = { 1, 2, 3, 4, 5, "Selenium", 6, 6.5 };// Defining Object array

		System.out.println(a.length);// 5
		System.out.println(s.length);// 2
		System.out.println(b.length);// 8

		System.out.println(a[4]);// 5
		System.out.println(s[1]);// Hello
		System.out.println(b[5]);// Selenium

		b[5] = "Automation"; // Modifying an array value using index
		System.out.println(b[5]);// Automation
	}

}
