//Your team is writing a fancy new text editor and 
//you've been tasked with implementing the line numbering.
//Write a function which takes a list of strings and returns 
//each line prepended by the correct number.
//The numbering starts at 1. The format is n: string. 
//Notice the colon and space in between.
//Examples: number(Arrays.asList()) # => []
//number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]

package core;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {

	public static List<String> formatNumber(List<String> lines) {

		for (int i = 0; i < lines.size(); i++) {
			int number = i + 1;
			String line = number + ": " + lines.get(i);
			lines.set(i, line);
		}

		for (int i = 0; i < lines.size(); i++) {
			System.out.print((lines.get(i)).toString() + ", ");
		}

		return lines;
	}

	public static void main(String[] args) {

		List<String> lines = new ArrayList<String>();
		lines.add("a");
		lines.add("b");
		lines.add("c");
		lines.add("d");
		lines.add("e");
		lines.add("f");
		lines.add("g");
		lines.add("h");
		lines.add("j");
		lines.add("k");
		lines.add("l");

		formatNumber(lines);

	}

}
