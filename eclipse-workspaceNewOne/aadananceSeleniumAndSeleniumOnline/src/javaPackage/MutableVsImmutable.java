package javaPackage;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {

		//mutable - can change
		int a[] = { 20, 10, 40, 50, 30 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // mutable -changeable
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s = new String("welcome");
		System.out.println(s); //welcome
		s.concat(" to java ");
		System.out.println(s); //welcome ---->Immutable - we cannot change
	
	}

}
