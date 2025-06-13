package javaPackage;

public class EH7 {

	public static void a(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException();
			} else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException, NullPointerException, ArithmeticException {

		Thread.sleep(2000);
		a(15);
		a(20);
		
		
		System.out.println("Exception Handled");

	}
	
	

}
