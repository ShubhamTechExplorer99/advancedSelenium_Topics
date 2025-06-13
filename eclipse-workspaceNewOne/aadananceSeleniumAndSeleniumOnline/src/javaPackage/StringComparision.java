package javaPackage;

public class StringComparision {

	public static void main(String[] args) {
		
		//Case1 :
		/*
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		*/
		
		//Case2 :
		
		/*
		String 	s1 = "welcome";
		String s2 = new  String("welcome");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); //false //to used compare the objects
		System.out.println(s1.equals(s2));//true //to compare values of objects
		*/
		
		//Case3 :
		
		
		String s1 = "abc";
		String s2 = new  String("abc");
		
		System.out.println(s1==s2);//fasle
		System.out.println(s1.equals(s2));//true
		
		/*
		/*Case4 :
			
		String s1 = "abc";
		String s2 = new  String("abc");	
		String s3 = s2;
		
		System.out.println(s1==s2);//fasle
		System.out.println(s1.equals(s2));//true bzoz objects aare same/equal
		System.out.println(s2==s3);//true
	
		*/
	
	}
}
