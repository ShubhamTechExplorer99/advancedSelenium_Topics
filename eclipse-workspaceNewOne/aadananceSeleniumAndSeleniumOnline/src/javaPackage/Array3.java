package javaPackage;

public class Array3 {

	static int c[] = { 22, 2, 44, 5 };

	public static void main(String[] args) {

		int b = c[0];

		for (int i = 0; i < c.length; i++) {
			if (b >= c[i]) {
				System.out.println(b);
			} else {
				System.out.println("ABCD");
			}

		}

	}
}
