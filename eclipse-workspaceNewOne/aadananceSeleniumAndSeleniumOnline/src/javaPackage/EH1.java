package javaPackage;

public class EH1 {

	public static void main(String[] args) {

		try {
			int a = 5 / 0;

		} catch (ArithmeticException a) {
			a.printStackTrace(); // Print complete execution info
			System.out.println(a); // Print only exception info
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println(ai);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Exception Handled");

	}

}
