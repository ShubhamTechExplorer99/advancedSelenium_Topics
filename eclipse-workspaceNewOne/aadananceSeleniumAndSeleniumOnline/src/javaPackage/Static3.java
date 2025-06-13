package javaPackage;

public class Static3 {

	int rollNo; // Global Variable
	String name;// Global Variable
	static String collage = "Sinhgad Institute";// static Variable

	Static3(int i, String s) {
		rollNo = i;
		name = s;

	}
	
	public void getResult() {
		
		System.out.println(rollNo + " " + name + " " + collage);
	}

}
