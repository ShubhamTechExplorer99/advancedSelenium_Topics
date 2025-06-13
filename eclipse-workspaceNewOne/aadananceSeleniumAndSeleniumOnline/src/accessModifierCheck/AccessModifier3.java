package accessModifierCheck;

import javaPackage.AccessModifier1;

public class AccessModifier3 extends AccessModifier1 {
	
	public static void main(String[] args) {
		
		AccessModifier1 a1 = new AccessModifier1();
		System.out.println(a1.c);
		
		System.out.println(AccessModifier1.d);
		
	}

}
