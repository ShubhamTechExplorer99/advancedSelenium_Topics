package javaPackage;

public class DataConversionMethods {

	public static void main(String[] args) {

		//Wrapper class
		// Scenarios 1
		// String - > int

		// String s = "Welcome"; //=Cannot convert to int
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1 + s1);// 1020
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));// 30

		// Scenarios 1
		// String -> Double
		String s3 = "10.5";
		String s4 = "20.0";
		System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

		// String -> Boolean
		String s5 = "True";//Other than true,if u pass any string it will return false
		System.out.println(Boolean.parseBoolean(s5));

		
		//Primitive typw to string   
		//int,double,boolean,char -> String
		int a = 10;
		double d = 10.5;
		char c = 'a';
		boolean b = true;
		
		String boo = String.valueOf(b);
		System.out.println(boo);
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		
		
	}

}
