package javaPackage;

public class TypeCastingNarrowing {
	
	public static void main(String[] args) {
		
		//Narrowing = one data type is coverted into another is called
				
		//Double into int conversion		
		
		double b = 5.9;
		int a = (int) b;
		
		System.out.println(b); //5.9
		System.out.println(a); //5
		
		//String into Int conversion
		
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);//10
		
		//Interger to string conversion
		
		int  z = 5;
		String s1 = String .valueOf(z);
		System.out.println(s1.length());//1
		System.out.println(s1); //5
		
		
	}

}
