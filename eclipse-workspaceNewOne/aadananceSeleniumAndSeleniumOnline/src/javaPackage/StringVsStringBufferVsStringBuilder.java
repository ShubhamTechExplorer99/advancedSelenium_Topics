package javaPackage;

public class StringVsStringBufferVsStringBuilder {
	
	public static void main(String[] args) {
		
		//String - immutable
		String s = "Welcome";
		s.concat("to java ");
		System.out.println(s);//welcome //immutable, cannot change the original of s
		
		
		//StringBuffer -mmutable
		StringBuffer  s1 = new StringBuffer("Welcome");
		s1.append(" to java");
		System.out.println(s1); //Welcome to java //mutable - we can change original value of s
	
	
		//StringBuilder
		StringBuilder sb = new  StringBuilder("Welcome");
		sb.append("to selenium");
		System.out.println(sb); // welcome to selenium //mutabke , we can change the originak value of sb
	
	}

}
