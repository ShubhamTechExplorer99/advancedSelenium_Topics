package javaPackage;

public class Loop3 {

	public static void main(String[] args) {

		int i = 10; // Local variable

		while (i < 15 & i < 12) {
			System.out.println(i);
			i++; // If we forget to pass incr , program will execute till infinite
		}

	}

}
