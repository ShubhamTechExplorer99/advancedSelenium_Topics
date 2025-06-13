package javaPackage;

public class AccessModifier1 {
	
	static private int a = 10;    //private
	static int b = 20;				//defalt
	protected static int c =30;		//protected
	public static int d =40;		//public
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
	}

}
