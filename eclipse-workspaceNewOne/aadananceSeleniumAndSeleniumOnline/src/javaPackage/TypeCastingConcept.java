package javaPackage;

//Upcasting : Converting value from smaller -> larger

// int -> long   = Upcasting
//float ->double=Upcasting

//Downcasting : Converting value from larger -> smaller
//Long ->
//double -> float

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//Upcasting -> Automatic -->Smaller to Larger
		int intvalue =100;
		long longvalue = intvalue ;
		System.out.println(longvalue);
		
		float floatvalue =10.5f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//Upcasting -> manually  -->larger to smaller
		long longvalu= 100000;
		int intvalu = (int)longvalu;
		System.out.println(intvalu);
		
		long longv =10000;
		double dvalu = (double)longv;
		System.out.println(dvalu);
		
		//Example1
		int i = 100;
		double d = i;
		System.out.println(d); //upcasting
		
		//Example2
		double d1= 10.50;
		int i1 = (int)d1;
		System.out.println(i1); //Downcasting
		
		
		
		

	}

}
