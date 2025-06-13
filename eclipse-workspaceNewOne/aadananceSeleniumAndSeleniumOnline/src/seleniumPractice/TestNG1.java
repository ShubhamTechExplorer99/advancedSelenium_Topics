package seleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a() {
		System.out.println("A method called");
	}
	
	@BeforeClass
	public void b() {
		System.out.println("b method called");
	}
	
	@AfterMethod
	public void c() {
		System.out.println("c method called");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("d method called");
	}
	
	@Test
	public void e() {
		System.out.println("e methods called");
	}
	
	@Test
	public void f() {
		System.out.println("f methods called");
	}
	
	@BeforeSuite
	public void g() {
		System.out.println("g method called");
	}
	
	@AfterSuite
	public void h() {
		System.out.println("h method called");
	}
	
	
	

}
