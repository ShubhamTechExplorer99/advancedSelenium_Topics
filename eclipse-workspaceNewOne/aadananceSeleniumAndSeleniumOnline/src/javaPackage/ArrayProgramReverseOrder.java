package javaPackage;

public class ArrayProgramReverseOrder {

	public static void main(String[] args) {

		int a[] = { 100, 200, 300, 400, 500, 700 };

		for (int i = a.length - 1; i >= 0; i--) { // i==0 or i>=0
			System.out.println(a[i]);
		}
	}

}
