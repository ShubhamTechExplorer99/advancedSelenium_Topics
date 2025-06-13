package mostAskedJavaProgram;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Automation";
		StringBuilder sb = new StringBuilder(s);
		StringBuilder reverse = sb.reverse();
		
		System.out.println(reverse);
	}

}
