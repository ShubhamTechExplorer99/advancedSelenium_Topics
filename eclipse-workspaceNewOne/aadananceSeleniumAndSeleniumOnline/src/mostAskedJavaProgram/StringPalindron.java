package mostAskedJavaProgram;

public class StringPalindron {
	
	public static void main(String[] args) {
		
		String str = "NitiN";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		String str1 = reverse.toString();
		
		if(str.equals(str1)) {
			System.out.println("String is palendron");
		}
		else
		{
			System.out.println("String is not a palendron");
		}
		
	}

}
