package javaPackage;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// Decleration

		// HashMap map = new HashMap();
		// Map hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");

		System.out.println(hm);// {101=John, 102=Scott, 103=Mary, 104=Scott, 105=David}

		// Size of the pair
		System.out.println("Size of hashmap : " + hm.size());

		// Remove pair
		hm.remove(103);
		System.out.println("After removing pair : " + hm);

		// Access vlue of the kay
		hm.get(102); // 102 is key
		System.out.println(hm.get(102));// Devid

		// get all the keys from hashmap
		System.out.println(hm.keySet());

		// get all the values from hashmap
		System.out.println(hm.values());

		// get Key and values from hashmap
		System.out.println(hm.entrySet());

		// Reading the data from for rach loop
		/*
		 * for (int k : hm.keySet()) { 
		 * System.out.println(k + "  " + hm.get(k)); 
		 * }
		 */
		// Using iterator

		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());

		}

		// clear
		hm.clear();
		System.out.println(hm.isEmpty());
	}
}
