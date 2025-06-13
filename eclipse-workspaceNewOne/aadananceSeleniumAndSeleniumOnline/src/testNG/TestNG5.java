package testNG;

import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void a() {
		System.out.println("Hellow a test method");
	}

	//Some  (invocationCount = 2,priority = -1,enabled = true & false) that situation faced ..true & false=false
	
	@Test(invocationCount = 2,priority = -1,enabled = true & false)
	public void b() {
		System.out.println("Hellow b test method");
	}

	@Test
	public void c() {
		System.out.println("Hellow c test method");
	}

	@Test
	public void d() {
		System.out.println("Hellow d test method");
	}

}
