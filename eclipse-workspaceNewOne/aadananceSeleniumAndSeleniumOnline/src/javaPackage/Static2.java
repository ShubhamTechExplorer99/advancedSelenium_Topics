package javaPackage;

public class Static2 {

	int rollNo;
	String name;
	String collage;

	public static void main(String[] args) {

		Static2 s2 = new Static2();

		System.out.println(s2.rollNo); // 0
		System.out.println(s2.name); // null
		System.out.println(s2.collage); // null

	}

}
