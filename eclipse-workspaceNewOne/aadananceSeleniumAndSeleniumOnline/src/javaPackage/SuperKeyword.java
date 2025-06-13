package javaPackage;

class SuperKeyword {

	String clour = "White";

	void eat() {
		System.out.println("eating");
	}

}

class Dog extends SuperKeyword {
	String colour = " Black";

	 void displayColour() {
		System.out.println(super.clour);
	}

	 void eat() {
		System.out.println("eating bread");
		super.eat();// parent class methods directly
	}

}