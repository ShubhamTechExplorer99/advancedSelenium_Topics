package accessModifierCheck;

public class WissenTechno {

	public static void main(String[] args) {

		String abc = "I am a good programmer";
		//Largesr word

		String largestWord="";
		String[] words = abc.split(" ");
		for(String word : words) {
			if(word.length()>largestWord.length()) {
				
				largestWord=word;
			}
		}
		System.out.println("The largest words : "+largestWord);

	}

}
