package mostAskedJavaProgram;

public class FabonocciSeries {

	public static void main(String[] args) {

		int n = 10, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series: " + num1 + ", " + num2);

		for (int i = 2; i <= n; i++) {
			int num3 = num2 + num1;
			System.out.println(", " + num3);
			num1 = num2;
			num2 = num3;

		}
	}

}
