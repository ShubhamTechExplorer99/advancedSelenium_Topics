package javaPackage;

public class MethodOverride7 {
	
	public static void main(String[] args) {
		
		MethodOverride5 mo5 = new MethodOverride6();
		
		mo5.cook();
		
		mo5.eat();
		
		//mo5.angry();  //undefined method  -you have passed the refernece of parent class and you are trying to called in child class
		
		
	}
	
	
	

}
