package seleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngPractice {
	
	@Test
	public void a2() {
		System.out.println("Hellow a2 Test Method");
	}

	@BeforeTest
	public void b() {
		System.out.println("Hellow b test method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Hellow c test method");
	}

	@AfterTest
	public void d() {
		System.out.println("Hellow d method");
	}

	@BeforeClass
	public void e() {
		System.out.println("Hellow e method");
	}

	@AfterTest
	public void f() {
		System.out.println("Hellow f method");
	}

	@AfterClass
	public void g() {
		System.out.println("Hellow g method");
	}

	@BeforeMethod
	public void h() {
		System.out.println("Hellow h method");
	}

	@AfterSuite
	public void i() {
		System.out.println("Hellow i method");
	}

	@Test
	public void a1() {
		System.out.println("Hellow a1 method");
	}

	@Test
	public void A1() {
		System.out.println("Hellow A1 method");
	}

	/*public static void main(String[] args) {
		System.out.println("Hellow Main Methods");
	}*/

}
	


