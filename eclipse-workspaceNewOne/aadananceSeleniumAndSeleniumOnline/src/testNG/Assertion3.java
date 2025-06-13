package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testCase2() {

		String actualText = "abc";
		String expectedText = "ab";

		// Equal Assertion

		try {
			Assert.assertEquals(actualText, expectedText);
		} catch (AssertionError e) {  //or we can use assertionerror change to error catch (AssertionError e)

			e.printStackTrace();
		}
		System.out.println("Equal Assertion verified");

	}

}
