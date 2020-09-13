//Complete the solution so that it splits the string into pairs of two characters. 
//If the string contains an odd number of characters then it should replace the 
//missing second character of the final pair with an underscore ('_').
//Examples: StringSplit.solution("abc") // should return {"ab", "c_"}
//		  StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
package core;

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {

	public static List<String> SplitString(String line) {

		List<String> splitRezult = new ArrayList<String>();
		String splitLines = " ";
		char character2;

		for (int i = 0; i < line.length(); i = i + 2) {

			char character1 = line.charAt(i);
			String s1 = String.valueOf(character1);

			if (line.length() % 2 != 0 && i == line.length() - 1) {
				character2 = '_';
			} else {
				character2 = line.charAt(i + 1);
			}

			String s2 = String.valueOf(character2);

			splitLines = s1 + s2;
			splitRezult.add(splitLines);

		}

		for (int i = 0; i < splitRezult.size(); i++) {
			System.out.print((splitRezult.get(i)).toString() + ", ");
		}

		return splitRezult;
	}

	public static void main(String[] args) {

		String line = "HelloWorld";
		SplitString(line);

	}

}

