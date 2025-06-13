package javaPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		//Declearation - 3 ways 
		
		HashSet myset = new HashSet();//Heterogenious Data
		//Set myset = new HashSet();//Heterogenious Data
		//HashSet<String> myset = new HashSet<String>();
		
		//Adding element into HashSet
		myset.add(100);
		myset.add(10.50);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing to hashset -run time duplicate and null only one value is print
		System.out.println(myset);
		
		//size of hashset
		System.out.println("Size of hashsset : "+myset.size());
		
		//Removeiing element
		myset.remove(10.5); //10.5 is a value(not an index)
		System.out.println("After removing : "+myset);
		
		//Inserting element - Not possible
		
		//Access Specific element - Not possible
		
		//Convert hashset to arraylist (insert or access the element)
		ArrayList al = new ArrayList(myset);
		System.out.println(al);//[null, A, 100, welcome, true]
		System.out.println(al.get(2));
		
		//Read all the element using only for each loop
		
		/*
		for(Object s:myset) {
			System.out.println(s);//read all the value of hashset
		}
		*/
		
		//using iterator
		/*
		Iterator<Object> it = myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		//Cannot remove multiple value
		
		//Clearing all the element in hashset
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
		
		
		
		
		
		
		
		
		
	}

}
