package javaPackage;

public class AdderPolymorphismMain {
	
	public static void main(String[] args) {
		
		AdderPolymorphism obj = new AdderPolymorphism();
		obj.sum();
		obj.sum(10.22, 10);
		obj.sum(10, 22.0);
		obj.sum(10, 20, 30);
		
	}

}
