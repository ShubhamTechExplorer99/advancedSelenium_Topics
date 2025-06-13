package testNG;

import org.testng.annotations.Test;

public class TestNG3 {

	// Priority - count (-8 -9 -10 0 1 2 3 ) there is no priority means zero
	// priority

	@Test(priority = -10)
	public void a() {
		System.out.println("Hellow a test method");
	}

	@Test(priority = 2)
	public void b() {
		System.out.println("Hellow b test method");
	}

	@Test(priority = 0)
	public void c() {
		System.out.println("Hellow c test method");
	}

	@Test
	public void d() {
		System.out.println("Hellow d test method");
	}

}
