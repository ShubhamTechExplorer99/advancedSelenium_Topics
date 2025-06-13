package javaPackage;

public class Constructor3 {

	//Constructor overloading
	
	Constructor3(){
		System.out.println("Hello No parameter");
	}
	
	Constructor3(int a){
		System.out.println(" int parameter");
	}
	
	Constructor3(String s){
		System.out.println(" String parameter");
	}
	
	public static void main(String[] args) {
		
		Constructor3 c3 = new Constructor3();
		Constructor3 c4 = new Constructor3(10);
		Constructor3 c5 = new Constructor3("Shubham");
	}
	
}
