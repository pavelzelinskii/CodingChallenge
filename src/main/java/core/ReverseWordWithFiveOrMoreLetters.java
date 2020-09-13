//Write a function that takes in a string of one or more words, 
//and returns the same string, but with all five or more letter 
//words reversed (Just like the name of this Kata). Strings passed 
//in will consist of only letters and spaces. Spaces will be included 
//only when more than one word is present.

//Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
//spinWords( "This is a test") => returns "This is a test" 
//spinWords( "This is another test" )=> returns "This is rehtona test"

package core;

public class ReverseWordWithFiveOrMoreLetters {

	public static String StrToStr1(String str) {
		String[] strings = str.split(" ");
		String newString = "";

		for (int i = 0; i < strings.length; i++) {
			String word = strings[i];
			if (word.length() >= 5) {
				word = StrToStr2(word);
			}
			newString = newString + word + " ";
		}

		return newString;
	}

	public static String StrToStr2(String word) {
		String reverseWord = "";
		for (int a = word.length() - 1; a >= 0; a--) {
			reverseWord = reverseWord + word.charAt(a);
		}
		return reverseWord;
	}

	public static void main(String[] args) {
		String str = "Good news everyone here";

		System.out.println(StrToStr1(str));
	}

}
