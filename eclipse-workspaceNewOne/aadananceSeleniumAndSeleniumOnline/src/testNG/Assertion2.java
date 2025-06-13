package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2() {

		String actualText = "abc";
		String expectedText = "ab ";

		int a = 10;
		int b = 20;

		// Equal Assrtion
		try {
			// both are matching then this line is not printed
			Assert.assertEquals(actualText, expectedText, "Actual  and Expected assertion are not matching");
		} catch (AssertionError e) {
			e.printStackTrace();
		} 
		
		System.out.println("Equal Assrtion verified.");

		// False Assertion
		Assert.assertFalse(a > b);
		System.out.println("Fasle assertion verified");

		// True Assertion
		Assert.assertTrue(a > b);
		// Assertion failed ,test execution will stop here
		// Further line of code will execute
		System.out.println("True Assertion verified");

	}

	@Test
	public void testcase3() {
		// Assertion is written in testcase2 method
		// scope of assertion will be limited to testcase2() method only
		System.out.println("Hellow testcase3 method");
	}

}
