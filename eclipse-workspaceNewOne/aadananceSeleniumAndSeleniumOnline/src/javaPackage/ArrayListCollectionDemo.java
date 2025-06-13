package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollectionDemo {

	public static void main(String[] args) {

		// Declearation
		ArrayList mylist = new ArrayList(); /// 1st way //Heterogenious
		// List mylist = new ArrayList(); // 2nd way //Heterogenious

		// ArrayList<String> mylist = new ArrayList<String>();//Homogenoius
		// ArrayList<Employee> mylist = new ArrayList<Employee>(); //Homogenoius

		// Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		// Size of Arraylist
		System.out.println(mylist.size());// 8

		// Printing arraylist
		System.out.println("Printing the data from arraylist : " + mylist); //[100, 10.5, Welcome, A, true, 100, null, null]

		//Remove element from arraylist
		mylist.remove(5); //here 5 is index of the element
		System.out.println("After Removing : "+mylist);
		
		//Insert element in the arraylist
		mylist.add(2, "Java");
		System.out.println(mylist);
		
		//Modification -Change the value(Modify/replace/change)
		mylist.set(2, "Python");
		System.out.println("After replacing : "+ mylist);
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3)); //here 3 is index
		
		//Reading all the element from arraylist
		
		//using Normal for loop
		/*
		for(int i=0;i<=mylist.size()-1;i++) {
			 System.out.println(mylist.get(i));
		}
		*/
		
		/*
		//Using for each loop
		for(Object x:mylist) {
			System.out.println(x);
		}
		*/
		
		/*
		//Using Iterator
		Iterator it = mylist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		//Checking arraylist is empty or not
		System.out.println(mylist.isEmpty());
		
		//Remove all the element from array list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(111);
		mylist2.add("shubham");
		
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements : "+ mylist);
		
		//Remove all the element /clear
		mylist.clear();
		System.out.println(mylist.isEmpty());
		
		
		
		
		
		
		
		
		
	}

}
