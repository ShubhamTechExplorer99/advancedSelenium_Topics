package javaPackage;
//Cat ct =(Cat) an;

class Animal {
} // Parent class

class Dog1 extends Animal {
} // Child class

class Cat extends Animal {
} // Child class

public class TypeCastingObject2 {

	public static void main(String[] args) {

		// Rule 1 -> Conversion is valid or not
		// Tyoe of d and c must have some relationship(either parent to child or child
		// to parent)

		Animal an = new Dog1();
		//Cat ct = (Cat) an; //valid as per rule 1
		
		
		Dog1 dg = new Dog1();
		//Cat ct = (Cat) dg;//coversion is not valid according to there is no relationship

		
		//Rule 2 ->assiignment is valid or not
		//'C' must be either same or child of 'A'
		
		Animal am = new  Dog1();
		Cat cc = (Cat)am;//Valid as per Rule2
		
		Animal as = new  Dog1();
		//SCat c3 = (Dog1)as;//InValid as per Rule2
		

		//Rule 3 ->
		//The inderlying object type of d must be either same or child od c
		
		Animal m = new Dog1();
		Cat s =(Cat)m ;//- invalid as per Rule 3 //ClassCastException
		
		//Rule1 .Rule2, Rule 3
		Animal ma = new Dog1();
		Dog1 ds = (Dog1) ma; //Rule 1 - Yes  Rule 2-Yes  Rule 3- Yes
		
		
		
	}

}
