package mostAskedJavaProgram;

public class CountConsecutive {

	public static void main(String[] args) {

		String input = "aaabbbacfwww"; // Input string
		StringBuilder result = new StringBuilder();

		int count = 1; // Initialize the count for the first character

		// Loop through the string to count consecutive characters
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++; // Increment count if characters match
			} else {
				// Append the character and its count to the result
				result.append(input.charAt(i - 1)).append(count);
				count = 1; // Reset count for the next character
			}
		}

		// Append the last character and its count
		result.append(input.charAt(input.length() - 1)).append(count);

		// Print the result
		System.out.println("Output: " + result.toString());
	}

}
