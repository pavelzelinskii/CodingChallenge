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

	public static void main(String[] args) {

		String inpStr = "internationalization ^hdgdg)ydg kguiuygk!ghgf";

		System.out.println(abbreviate(inpStr));

	}

	private static String abbreviate(String inpStr) {

		inpStr = inpStr + " ";
		String resultStr = "";
		String tmpStr = "";
		char tmpChar = 'A';
		int charCnt = 0;

		for (int i = 0; i < inpStr.length(); i++) {

			tmpChar = inpStr.charAt(i);

			if (isLetter(tmpChar)) {
				tmpStr = tmpStr + inpStr.charAt(i);
				charCnt = charCnt + 1;
			} else {
				if (charCnt > 3) {
					resultStr = resultStr + tmpStr.charAt(0);
					resultStr = resultStr + (charCnt - 2);
					resultStr = resultStr + tmpStr.charAt(tmpStr.length() - 1) + inpStr.charAt(i);
					tmpStr = "";
					charCnt = 0;
				} else if (charCnt <= 3) {
					resultStr = resultStr + tmpStr + inpStr.charAt(i);
					tmpStr = "";
					charCnt = 0;
				} else {
					resultStr = resultStr + inpStr.charAt(i);
				}
			}

		}
		return resultStr.trim();
	}

	private static boolean isLetter(char tmpChar) {

		if ((tmpChar >= 'A' && tmpChar <= 'Z') || (tmpChar >= 'a' && tmpChar <= 'z'))

			return true;

		return false;
	}

}
