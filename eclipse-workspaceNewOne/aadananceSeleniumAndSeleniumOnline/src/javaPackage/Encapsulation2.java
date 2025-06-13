package javaPackage;

public class Encapsulation2 extends Encapsulation1 {
	
	//Final method can not be override
	/*
	final void d() {
		System.out.println("Final method in encapsulation2");
	}*/
	
	public static void main(String[] args) {
		
		Encapsulation2 e2 = new Encapsulation2();
		e2.setName("Selenium");
		System.out.println(e2.getName());
		
		e2.b=555;
		System.out.println(e2.getB());
	}

}
