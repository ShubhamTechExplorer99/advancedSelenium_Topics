package javaPackage;

import java.util.Hashtable;

public class HashTable1 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm  = new Hashtable<Integer, String>();
		hm.put(12, "Dec");
		hm.put(11, "Nov");
		
		
		System.out.println(hm.get(11)); //Nov
		System.out.println(hm.get(12)); //Dec
		
		System.out.println(hm); //All values with key
		
		//HashTable Always execute bottom to top order
	}

}
