package javaPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionCheckedException {

	public static void main(String[] args) throws InterruptedException, Exception {

		System.out.println("Pragram Started");
		System.out.println("Pragram inprocess");

		//Example 1 : FileNotFoundException
		
		// FileNotFoundException  :  file location not matched
		FileInputStream fis = new FileInputStream("c//s/jahduas.text");

		
		//Example 2 : Throws
		Thread.sleep(5000);
		// Throws
		// We can handle this type or directly throows
		/*
		 * try { Thread.sleep(3000); } catch(InterruptedException e) {
		 * 
		 * }
		 */

		System.out.println("Pragram finished");
		System.out.println("Pragram Excited");

	}

}
