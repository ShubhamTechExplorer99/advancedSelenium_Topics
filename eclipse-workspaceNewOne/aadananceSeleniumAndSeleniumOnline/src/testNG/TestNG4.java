
package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// To skipp the one test case in the code
	
	//1st way - To comment the @test annotation

	//@Test
	public void a() {
		System.out.println("Hellow a test method");
	}
	
	//2nd way - Widely used in the market i e (enabled = false)

	@Test(enabled = false)
	public void b() {
		System.out.println("Hellow b test method");
	}

	@Test(enabled = true)
	public void c() {
		System.out.println("Hellow c test method");
	}
	
	//InvocationCount - It means one tc can execute two or multiple time.
	//invocationCount = 2 times execute
	
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("Hellow d test method");
	}

	//3rd way -(invocationCount = 0) skipped tc
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("Hellow e test method");
	}
	
	//Conditional Skipping -skipped testcas -tc will execute but after throw keyword remaning line is skip
	//TC will execute but after throw keyword remaining line of code will not execute i e skipped that line
	
	@Test
	public void f() {
		System.out.println("Hellow f test method");
		throw new SkipException("Skipped f test method"); //:org.testng.SkipException

	}

}
