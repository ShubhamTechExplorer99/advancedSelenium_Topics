package javaPackage;

public class Variable4 {
	
	public static void main(String[] args) {
		
		int i[]= {1,2,3,4,5,6};
		
		String str[]= {"Shubham","Jadhav"}; 
		
		System.out.println(i[1]);//2
		System.out.println(i[4]);//5
		System.out.println(i[5]);//6
		System.out.println(str[1]);//Jadjav
		
		Object obj[]= {1,2,3,"Shubham","Jadhav",30.14,10.3,3>12,'s'};
		
		System.out.println(obj[8]);//s
		System.out.println(obj[5]);//30.14
		System.out.println(obj[1]);//2
		System.out.println(obj[4]);//Jadhav
		System.out.println(obj[3]);//Shubham
		System.out.println(obj[7]);//False
	}

}
