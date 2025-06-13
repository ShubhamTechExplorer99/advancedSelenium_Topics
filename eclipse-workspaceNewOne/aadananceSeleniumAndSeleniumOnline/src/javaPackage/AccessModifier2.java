package javaPackage;

public class AccessModifier2 {
	
	public static void main(String[] args) {
		
		//System.out.println(AccessModifier1.a);  beacuse it is private  the scope of private access modifier is with a class only
		
		System.out.println(AccessModifier1.b); //it is accessible 
		
		System.out.println(AccessModifier1.c); //it is accessiblle  protected is also accessioble for same page or outside the package
	}

}
