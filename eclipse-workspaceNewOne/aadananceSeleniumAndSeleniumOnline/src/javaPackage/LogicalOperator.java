package javaPackage;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		int b = 5; //Local Variable
		int c = 20; //Local Variable
		
		//Logical operator - If  first condition false, 2nd condition will not check
		System.out.println(a < b  && a < c); //false
		
		//Bitwise operator -wil check both the condition
		System.out.println(a < b & a < c); //false
		
		
	}

}
