//The word i18n is a common abbreviation of internationalization in the developer community, 
//used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is 
//an abbreviation of accessibility.
//Write a function that takes a string and turns any and all "words" (see below) within that 
//string of length 4 or greater into an abbreviation, following these rules:
//	A "word" is a sequence of alphabetical characters. By this definition, any other character 
//	like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words 
//	(eg. "elephant" and "ride"). The abbreviated version of the word should have the first letter, 
//	then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").

package core;

public class Abbreviator {

	public static String abbreviate(String line) {
		
		String delimeter = "[ !@#$%^&*()-_,./<>?;':]";
		String[] words = line.split("");
		String newLine1 = "";
		String newLine2 = "";
		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			if (word.length() >= 4) {

				char oneCharacter1 = word.charAt(0);
				char oneCharacter2 = word.charAt(word.length() - 1);
				int number = word.length() - 2;
				String first = String.valueOf(oneCharacter1);
				String last = String.valueOf(oneCharacter2);
				String middle = String.valueOf(number);
				word = first + middle + last;
			}
			
			newLine1 = newLine1 + word + " ";
		}
			newLine2 = newLine1.trim();
			
		return newLine2;
}

	public static void main(String[] args) {

		String line = "internati_onalization lkhkgk! ojii, oiu";

		System.out.println(abbreviate(line));
	}
}
