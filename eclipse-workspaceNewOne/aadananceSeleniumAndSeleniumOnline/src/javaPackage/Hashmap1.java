package javaPackage;

import java.util.HashMap;

public class Hashmap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "March");
		
		System.out.println(hm.get(1)); //Jan
		System.out.println(hm.get(2)); //Feb
		System.out.println(hm.get(3)); //March
		
		System.out.println(hm); //All values with key
		
		HashMap<String, Double> h2 = new HashMap<String, Double>();
		h2.put("Shubham", 20.20);
		h2.put("Ganesh", 10.10);
		
		System.out.println(h2);
		
		
	}
	

}
