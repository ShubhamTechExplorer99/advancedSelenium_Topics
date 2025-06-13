package javaPackage;

public class Static1 {
	
	int x = 100;  //Global variable
	String str = "Hello"; //global variable
	static  int y =100; //static variable
	
	
	//static method
	public static void method1() {
		String s = "Hi shubham"; //Local variable
		System.out.println(s); //calling s variable
	}
	
	//Non static method
	public void method2() {
		int i =100;  //Local variable
		System.out.println(i);
	}
	
	

}
