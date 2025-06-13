package javaPackage;

class Parent1 {
	String name = "John";

	void m1() {
		System.out.println("This is m1 from parent");
	}
}

class Child extends Parent1{

	int id = 101;

	void m2() {
		System.out.println("This is m2 from Child");
	}
}

public class TypeCastingObject {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		Parent1 p = new Child(); //Upcasting
		System.out.println(p.name);
		p.m1();
		//System.out.println(p.id);  //we canNot Accessed
		//p.m2();   //wecanNot Accessed refernece veriable is parent
		
		Parent1 p12 = new Parent1();
		Child c12 = (Child)p12;
		System.out.println(c12.id);//Run time error
		System.out.println(c12.name);//Run time error
		c12.m1();//Run time error
		c12.m2();//Run time error
		

	}

}
