package javaPackage;

public class StringPrograms {

	public static void main(String[] args) {

		// Example1 : Reverse string = Approach1-  length(), charAt()

		String s = "welcome";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
		
		//Using StringBuffer class
		StringBuffer s1 = new StringBuffer("I AM SHUBHAM");
		System.out.println(s1.reverse());
		
		//Using  StringBuilder class
		StringBuilder s2 = new StringBuilder("I am from pune");
		System.out.println(s2.reverse());
	}
	
	
	
	

}
