package javaPackage;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "welcome";
		System.out.println(s1);

		// String methods

		// length()-Returns length of a string(string of characrter)
		String s2 = " to java";
		System.out.println(s2.length());

		// Concat methods-to joining the two string
		System.out.println(s1.concat(s2)); // welcome to java
		System.out.println((s1 + s2));

		// to join multiple string
		String s3 = " Automation";
		System.out.println("Concation of more string : " + s1.concat(s2).concat(s3));
		System.out.println((s1 + s2 + s3));
		System.out.println(s1.concat(s2 + s3));

		System.out.println("Welcome to " + " Automation Testing");

		// trim()=To remove the spaces from right and left side
		String s4 = "   Shubham  ";
		System.out.println(s4.trim());

		// charat()=Return a character from a string based on index
		String s5 = "welcome";
		System.out.println(s5.charAt(3));

		// contains()=To check the particular string is a part of main string or not
		// Always returns boolean value
		System.out.println(s1.contains("wel"));
		System.out.println(s1.contains("WELCOME"));
		System.out.println(s1.contains("Wel"));
		System.out.println(s1.contains("come"));

		// equals() , equalsIgnoreCase()- compare strings
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase("WELCOME")); // Donot impact capital or small alphabates
		System.out.println(s1.equals("welcome")); // Check capital or small

		// replace()-replace single/multiple(sequence) of characters in a string
		String ss = "welcome to selenium java selenium python selenium c#";
		System.out.println(ss.replace('s', 'x')); // welcome to xelenium java xelenium python xelenium c#

		System.out.println(ss.replace("selenium", "cypress"));// welcome to cypress java cypress python cypress c#

		// substring()- To substract the some portion of main string
		System.out.println(ss.substring(0, 5));// welco

		// toUppercase() toLowerCase
		System.out.println(ss.toUpperCase());
		System.out.println(ss.toLowerCase());

		// split() -split the string into multiple parts based on delimeter
		String a = "abc@gmail.com";
		String s[] = a.split("@");
		System.out.println(s[0]);// abc
		System.out.println(s[1]);// gmail.com
		
		//ex1
		String amount = "$15,20,30";
		System.out.println(amount.replace("$", ""));  //15,20,30
		System.out.println(amount.replace("$", "").replace(",", ""));//152030
		
		//ex2
		
		String name = "John Kenedy";
		
		System.out.println(name.replace('J', 'j').contains("john"));
		
		System.out.println(name.toLowerCase().contains("john"));
	}

}
