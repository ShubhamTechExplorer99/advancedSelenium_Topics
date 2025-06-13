package accessModifierCheck;

public class Mphisis {
    public static String secondLargestWord(String str) {
        String[] words = str.split(" ");
        String longest = "", secondLongest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                secondLongest = longest;
                longest = word;
            } else if (word.length() > secondLongest.length() && word.length() < longest.length()) {
                secondLongest = word;
            }
        }

        return secondLongest.isEmpty() ? null : secondLongest;  // Return second longest word or null if not found
    }

    public static void main(String[] args) {
        String str = "My name is shubham";
        System.out.println(secondLargestWord(str));  // Output: "name"
    }
}