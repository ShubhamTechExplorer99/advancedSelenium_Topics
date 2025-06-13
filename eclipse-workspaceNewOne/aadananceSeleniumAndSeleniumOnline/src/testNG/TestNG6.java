package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	// Depedent and Skipping the tc

	@Test
	public void a() {
		Assert.assertTrue(3 < 12);
		System.out.println("a test method");
	}

	@Test
	public void b() {
		Assert.assertTrue(3 < 12 & 4 > 5);
		System.out.println("b test method");
	}

	@Test(dependsOnMethods = {"a" , "b"})
	public void c() {
		System.out.println("c test method");
	}

}
