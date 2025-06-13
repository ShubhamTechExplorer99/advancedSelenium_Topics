package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//Creating the Arraylist
		ArrayList<Object> obj = new ArrayList<Object>();
		
		//Adding object in the arraylist
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.5);
		obj.add(3 > 12);
		
		//Print Arraylist Element -1st way
		System.out.println(obj);
		
		//Print Arraylist Element -2st way (Using for each loop)
		for(Object o :obj) {
			System.out.println("For each loop : "+o);
		}
		
		//Print Arraylist Element -3rd way (Using while loop and iterator)
		Iterator abc = obj.iterator();
		while(abc.hasNext()) {
			System.out.println("while loop : "+ abc.next());
		}
		
		
	}

}
