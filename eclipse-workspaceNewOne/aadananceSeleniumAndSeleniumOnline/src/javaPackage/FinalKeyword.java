package javaPackage;

// Variable -We cannot change the value in variable once variable is final
//Methods - We cannot override that methods
//Class- We cannot extends that class

class Test {

	final int x = 100;

}

public class FinalKeyword extends Test {

	public static void main(String[] args) {

		Test t = new Test();
		// t.x = 200; //Do not chnage the final variable that value is fixed

		System.out.println(t.x);
	}

}
