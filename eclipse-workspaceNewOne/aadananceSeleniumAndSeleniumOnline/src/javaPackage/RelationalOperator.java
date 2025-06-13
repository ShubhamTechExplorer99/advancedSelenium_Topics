package javaPackage;

public class RelationalOperator {
	
	public static void main(String[] args) {
		
		int a = 300; //Local Variable
		int b =300; //Local Variable
		
		if(a != b) {
			System.out.println("a is not equal to b");
		}
		else {
			System.out.println("a is equal to b");
		}
		
		String p ="HELLOW";
		String q ="hellow";
		
		//String comparisiom - 1st way-case sensetive
		if(p == q) {
			System.out.println("p and q are  equal for 1st way");
		}
		else {
			System.out.println("p and q are not equal to 1st way ");
		}
		
		//String comparisiom - 2st way-case sensitive
		if(p.equals(q)) {
			System.out.println("p and q are equal for 1st way");
		}
		else
		{
			System.out.println("p and q are not equal for 1st way");
		}
		
		//String Comparision - 3rd way - case sensitive
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 1st way");
		}
		else
		{
			System.out.println("p and q are not equal for 1st way");
		}
		
		
	}

}
